package viewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import controller.EvaluationController;
import model.EvaluationDTO;
import model.TeacherDTO;
import util.ScannerUtil;

public class EvaluationViewer {

    private StudentViewer studentViewer;
    private EvaluationController controller;
    private Scanner scanner;
    private final String FORMAT_STRING = new String("y.M.d");

    public EvaluationViewer(StudentViewer studentViewer) {
        controller = new EvaluationController();
        scanner = new Scanner(System.in);
        // 의존성 주입(Dependency Injection)을 하는 코드
        this.studentViewer = studentViewer;
    }

    // 해당 교사의 평가를 모두다 보여주는 printList()
    // 파라미터가 해당 교사 객체다
    public void printList(TeacherDTO t) {
        while (true) {
            // 해당 교사의 id값을 통해서 그 교사에 연간된 평가 목록을 불러온다.
            ArrayList<EvaluationDTO> list = controller.selectById(t.getId());
            SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_STRING);
            for (EvaluationDTO e : list) {
                // 작성한 학생의 이름을 출력하기 위해
                // e.getStudentId()로 해당 학생 객체를 불러온다
                // 그러나 우리가 해당 학생의 정보를 갖고 오려면
                // studentController가 필요한데 지금 없음 ㅎㅋㅎ
                // 데이터베이스가 있으면 쉽게처리 가능인데 우린 없음 ㅋㅎㅋㅎ
                // studentViewer에 어쩔 수 없이 controller에서 이름을 갖고 오는
                // 메소드를 만들어서 대신 써야 한다.
                System.out.printf("%d. %s -  %s(%s)\n", e.getId(), e.getContent(),
                        studentViewer.selectNameById(e.getStudentId()).getName(), sdf.format(e.getWrittenDate().getTime()));
            }
            if(studentViewer.isLogInNull()) {
                String message = new String("1. 뒤로가기");
                ScannerUtil.nextInt(scanner, message, 1, 1);
                break;
            }
            
            // 전체 프린트 후에 메뉴를 출력해버리네
            String message = new String("1. 새 평가 등록 2. 삭제 3. 뒤로가기");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                insert(t);
            } else if (userChoice == 2) {
                message = new String("삭제할 평가의 번호를 입력해 주세요.");
                userChoice = ScannerUtil.nextInt(scanner, message);

                EvaluationDTO e = controller.selectOne(userChoice);
                while (e == null) {
                    System.out.println("잘못 입력하셨습니다.");
                    userChoice = ScannerUtil.nextInt(scanner, message);
                    e = controller.selectOne(userChoice);
                }
                delete(userChoice);
            } else if (userChoice == 3) {
                break;
            }
        }
    }

    // 입력 메소드
    public void insert(TeacherDTO t) {
        // studentViewer에서 logIn객체를 사용한것 메소드를 이용하자 하여간 logIn객체가 있는 곳에서 다가져오자
        int studentId = studentViewer.selectLogInid();

        if (controller.validateStudentId(studentId)) {
            System.out.println("한번에 한개의 평가만 등록하실 수 있습니다.");
        } else {
            // 정보를 추가할 Evaluation 객체를 만들다.
            EvaluationDTO e = new EvaluationDTO();
            String message;
            message = new String("교사의 평을 입력해주세요.");
            e.setContent(ScannerUtil.nextLine(scanner, message));
            e.setTeacherId(t.getId());
            e.setStudentId(studentViewer.selectLogInid());
            controller.add(e);
        }
    }

    public void delete(int id) {
        EvaluationDTO e = controller.selectOne(id);
        if (e.getStudentId() == studentViewer.selectLogInid()) {
            String message = new String("정말로 삭제 하시겠습니까? y/n");
            String yesNo = ScannerUtil.nextLine(scanner, message);
            if (yesNo.equalsIgnoreCase("Y")) {
                controller.delete(e);
            }
        } else {
            System.out.println("자신이 작성한 평가만 삭제 가능합니다.");
        }
    }

}
