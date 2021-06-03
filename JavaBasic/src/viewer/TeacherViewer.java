package viewer;
// 학생과 관련된 UI를 담당하는 StudentViewer 클래스

import java.util.ArrayList;
import java.util.Scanner;
import controller.TeacherController;
import model.TeacherDTO;
import util.ScannerUtil;
public class TeacherViewer {
    
    private Scanner scanner;
    private TeacherController controller;
    private TeacherDTO teacherLogIn;
    
    // 생성자를 통해서 각각의 필드를 초기화 해준다.
    public TeacherViewer() {
        scanner = new Scanner(System.in);
        controller = new TeacherController();
    }
    
    // 1. 회원 가입을 담당하는 메소드
    public void register() {
        // 1-1. 교사 객체 생성 (사용자가 입력한 정보를 받을것)
        TeacherDTO t = new TeacherDTO();
        
        // 1-2. 입력에 사용할 String객체 message 선언
        String message;
        
        // 1-2. 학생이 사용하고자 하는 아이디를 입력 받는다.
        message = new String("사용하실 아이디를 입력해주세요.");
        t.setUsername(ScannerUtil.nextLine(scanner, message));
    
        // 1-3. 사용자가 입력한 아이디가 유효한 아이디인지 체크하고
        //      유효하지 않으면 다시 입력을 받는다.
        while(controller.validateUsername(t)) {
            System.out.println("이미 중복된 아이디 입니다.");
            t.setUsername(ScannerUtil.nextLine(scanner, message));
        }
        
        // 1-5. 사용자의 비밀번호를 입력받아서 학생 객체에 추가해준다.
        message = new String("사용하실 비밀번호를 입력해주세요.");
        t.setPassword(ScannerUtil.nextLine(scanner, message));

        // 1-6. 사용자의 이름을 입력받아서 학생 객체에 추가해준다.
        message = new String("이름을 입력해주세요.");
        t.setName(ScannerUtil.nextLine(scanner, message)); 
    
        // 1-7. 사용자의 소속반을 입력받아서 학생 객체에 추가 해준다.
        message = new String("소속 반을 입력해주세요.");
        t.setGroup(ScannerUtil.nextInt(scanner, message));
        
        // 1-8. 반정보가 유효한지 체크
        while (controller.validateGroup(t)) {
            System.out.println("이미 담당교사가 존재하는 반입니다.");
            t.setGroup(ScannerUtil.nextInt(scanner, message));
        }
        
        // 1-9. 정보가 들어있는 객체를 컨트롤러의 add() 메소드 한다.
        controller.add(t);
    }
    
    // 파라미터와 group의 값이 같은 TeacherDTO 객체를 리턴해주는 메소드
    public TeacherDTO selectOneByGroup(int group) {
        return controller.selectOneByGroup(group);
        // DTO는 controller가 가지고 있다
    }
    
    // 2. 로그인 담당하는 메소드
    public int logIn() { // 로긴하면서 바로 int group을 넘겨줄 것이다
        // 2-1. 사용자가 입력한 정보를 담을 TeacherDTO 객체 t
        TeacherDTO t = new TeacherDTO();
        
        // 2-2. 출력에 사용할 메세지를 담을 String객체 message 선언
        String message;
        
        // 2-3. 사용자로부터 아이디를 입력 받는다.
        message = new String("아이디를 입력해주세요.");
        t.setUsername(ScannerUtil.nextLine(scanner, message));
        
        // 2-4. 사용자로부터 비밀번호를 입력 받는다.
        message = new String("비밀번호를 입력해주세요.");
        t.setPassword(ScannerUtil.nextLine(scanner, message));
        
        // 2-5. s에 해당 정보를 담아서 컨트롤러에 보내주고 결과값은 객체 result에 담아준다.
        TeacherDTO result = controller.auth(t);
        
        // 2-6. 만약 결과가 null이면 다시 입력을 받거나
        //      아니면 뒤로 갈 지 물어본다.
        while (result == null) {
            System.out.println("잘못 입력 하셨습니다.");
            message = new String("종료하시겠습니까? y/n");
            String agree = ScannerUtil.nextLine(scanner, message);
            if (agree.equalsIgnoreCase("Y")) {
                return -1;
            }
            message = new String("아이디를 입력해주세요.");
            t.setUsername(ScannerUtil.nextLine(scanner, message));
            
            message = new String("비밀번호를 입력해주세요.");
            t.setPassword(ScannerUtil.nextLine(scanner, message));
            
            result = controller.auth(t);
        }
        // 2-7. null이 아닐경우 result.getGroup()를 return한다
        return result.getGroup();
    }
    
}
