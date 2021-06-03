package day0318;

//학생관리 프로그램을
// 인덱스가 아니라 학생번호를 기준으로 하여 만드시오
// 중복학생인지는 번호로만 판단하도록 합니다
import java.util.ArrayList;
import java.util.Scanner;
import util.ScannerUtil;

public class GradeBook01_na {
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int SIZE_MAX = 3;
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> studentList = new ArrayList<>();
    public static void main(String[] args) {
        
        showMenu();
    
    }

    private static void showMenu() {
        while(true) {
            System.out.println();
            System.out.println("=================== 학생 정보 관리 ===================");
            System.out.println("원하는 메뉴를 선택하여 입력하세요.");
            String message = new String("1. 학생정보 입력   2. 학생정보 출력   3. 프로그램 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                insertInfo();
            } else if (userChoice == 2) {
                printAll();
            } else if (userChoice == 3) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }
        }
    }
    
    private static void insertInfo() {
        Student s = new Student();
        
        String message = new String("번호를 입력하세요.");
        s.setId(ScannerUtil.nextInt(scanner, message));
        
        while ( studentList.contains(s) ) {
            System.out.println("중복된 번호입니다. 다시 확인 하세요.");
            message = new String("번호를 입력하세요.");
            s.setId(ScannerUtil.nextInt(scanner, message));
        }
        
        message = new String("이름을 입력하세요.");
        s.setName(ScannerUtil.nextLine(scanner, message)); 

        message = new String("국어 점수를 입력하세요.");
        s.setKorean(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));

        message = new String("영어 점수를 입력하세요.");
        s.setEnglish(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = new String("수학 점수를 입력하세요.");
        s.setMath(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
    
        studentList.add(s);
    }
    
    private static void printAll() {
        
        while(true) {
            
            if ( studentList.size() > 0 ) {
                System.out.println(">>> 등록된 학생목록");
                for ( int i = 0; i < studentList.size(); i++) {
                    System.out.printf("%3d번 %s\n", studentList.get(i).getId(), studentList.get(i).getName());
                }
                System.out.println();
                String message = new String("1. 학생 정보 보기  0. 메뉴로 돌아가기");
                int userChoice = ScannerUtil.nextInt(scanner, message);
                if ( userChoice == 1 ) {
                    message = new String("정보를 열람할 학생번호를 입력하세요.");
                    printOne();
                } else if (userChoice == 0) {
                    break;
                }
            } else {
                System.out.println();
                System.out.println("아직 등록된 학생이 없습니다.");
                break;
            }
            
        }
        
    }
    
    private static void printOne() {
        
        
        String message = new String("1. 학생정보수정 2. 학생정보삭제 0.학생 목록으로 돌아가기");
    }
    
    private static void modify() {
        
    }
    
    private static void delete() {
        
    }
    
}
