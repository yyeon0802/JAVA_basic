package day0318;

import java.util.ArrayList;
import java.util.Scanner;

import day0316.Student;
import util.ScannerUtil;

public class GradeBook01 {
    private static ArrayList<Student> list = new ArrayList<>();
    private static final int SCORE_MIN = 0;
    private static final int SCORE_MAX = 100;
    private static Scanner scanner = new Scanner(System.in);
    private static int currentId = 1; // 이거 추가요 목록의 번호,,
    public static void main(String[] args) {
        
        showMenu();
    }

    private static void showMenu() {
        while (true) {
            System.out.println("========================================");
            System.out.println("               비트 고등학교              ");
            System.out.println("             성적 관리 프로그램            ");
            System.out.println("========================================");
            String message = new String("1. 입력\n2. 목록 보기\n3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (userChoice == 1) {
                insert();

            } else if (userChoice == 2) {
                printAll();

            } else if (userChoice == 3) {
                System.out.println("사용해 주셔서 감사합니다.");
                break;
            }
        }
    }

    // 입력을 담당하는 메소드
    private static void insert() {
        
        Student s = new Student();

        s.setId(currentId++);

        String message = new String("학생의 이름을 입력하세요.");
        s.setName(ScannerUtil.nextLine(scanner, message));

        message = new String("학생의 국어 점수를 입력하세요.");
        s.setKorean(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));

        message = new String("학생의 영어 점수를 입력하세요.");
        s.setEnglish(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));

        message = new String("학생의 수학 점수를 입력하세요.");
        s.setMath(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));

        list.add(s);
    }

    private static void printAll() {

        while (true) {
            if (list.size() == 0) {
                System.out.println();
                System.out.println("아직 입력된 학생의 정보가 존재하지 않습니다.");
                System.out.println();
                break;
            }
            
            System.out.println();
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%d. %s \n", list.get(i).getId(), list.get(i).getName());
            }

            String message = new String("개별 보기할 학생의 번호를 선택해 주세요. 뒤로가기는 0을 입력 하세요.");
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            //이거중요!
            Student s = new Student();
            s.setId(userChoice);
            
            //여기서 미리 체크하자
            while ( !(userChoice == 0 || list.contains(s)) ) {
                System.out.println("해당 학생번호는 유효하지 않습니다.");
                userChoice = ScannerUtil.nextInt(scanner, message);
            }
            
            if (userChoice == 0) {
                System.out.println();
                System.out.println("메뉴로 돌아갑니다.");
                System.out.println();
                break;
            } else {
                printOne(userChoice);

            }
        }

    }
    
    private static int findIndex(int id) { //int id는 위에 userChoice 넣은것
        
        Student s= new Student();
        s.setId(id);
        
        // int index = list.indexOf(s);
        return list.indexOf(s); // 이렇게 바로 바꿔줘도 되잖냐
    }

    private static void printOne(int id) {
        
        int index = findIndex(id);
        
        if (index == -1) {
            System.out.println();
            System.out.println("해당 학생번호는 존재하지 않는 번호입니다.");
            System.out.println();
        }else {
            
            list.get(index).showInfo();
            String message = new String("1. 수정 2. 삭제 3. 뒤로 가기");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            
            if ( userChoice == 1 ) {
                update(id);
                printOne(id);
            }else if (userChoice == 2 ) {
                delete(id);
            }
        }
        
    }
    
    // 수정 메소드
    private static void update(int id) {
        int index = findIndex(id);
        
        if( index == -1) {
            System.out.println();
            System.out.println("해당 학생번호는 유효하지 않은 번호 입니다.");
            System.out.println();
        }else {
            
            String message = new String("학생의 국어 점수를 입력하세요.");
            list.get(index).setKorean(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
            
            message = new String("학생의 영어 점수를 입력하세요.");
            list.get(index).setEnglish(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
            
            message = new String("학생의 수학 점수를 입력하세요.");
            list.get(index).setMath(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        }
        

    }
    
    // 삭제 메소드
    private static void delete(int id) {
        
        int index = findIndex(id);
        
        if (index == -1) {
            System.out.println();
            System.out.println("해당 학생번호는 존재하지 않는 번호입니다.");
            System.out.println();
        }else {
            
            String message = new String("정말로 삭제 하시겠습니까? 삭제 하시려면 Y 혹은 y를 입력해주세요. ");
            String yesNo = new String(ScannerUtil.nextLine(scanner, message));
            
            // String에는 대소문자 구별 없이 특정 스트링과 같은지를 확인하는
            // equalsIgnoreCase()라는 메소드가 있다.
            if (yesNo.equalsIgnoreCase("Y")) {
                list.remove(index);
            } else {
                printOne(id); // 다시 프린트원에서 검사를 할것이니 id 넣어주라 index넣으면 이상하게 검사할것
            }
        }
        
    }
}
