package day0316;

// 캡슐화가 적용된 Student 클래스를 사용하여 
// 학생 5명을 관리하고
// 만약 똑같은 이름과 번호를 가진 또다시 입력할 수 없는
// 성적관리 프로그램 작성

import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;

public class GradeBook02 {
    
    static final int SIZE_STUDENTS = 5;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] studentsArr = new Student[0];
        
        while (true) {
            String message = new String("1. 입력  2. 출력  3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (userChoice == 1) { 
                Student s = new Student(); //!!!! while 안에 있어야 덮여 씌여지지 않는다 
                if ( ArrayUtil.size(studentsArr) < SIZE_STUDENTS ) {//? 범위 조심
                    message = new String("번호 입력");
                    s.setId(ScannerUtil.nextInt(scanner, message));
                    
                    message = new String("이름 입력");
                    s.setName(ScannerUtil.nextLine(scanner, message));
                    
                    
                    while (ArrayUtil.contains(studentsArr, s)) {
                        System.out.println("중복된 번호와 이름입니다.");
                        
                        message = new String("번호 입력");
                        s.setId(ScannerUtil.nextInt(scanner, message));
                        
                        message = new String("이름 입력");
                        s.setName(ScannerUtil.nextLine(scanner, message));
                    }
                    
                    
                    message = new String("국어 입력");
                    int korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
                    s.setKorean(korean);
                    
                    message = new String("영어 입력");
                    int english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
                    s.setEnglish(english);
                    
                    message = new String("수학 입력");
                    int math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
                    s.setMath(math);
                    
                    studentsArr = ArrayUtil.add(studentsArr, s); // 이걸 해야해
                    
                } else {
                    System.out.println("더이상 입력할 수 없습니다.");
                }
                

            } else if (userChoice == 2) {
                if (ArrayUtil.size(studentsArr) > 0 ) {

                    System.out.println(); //구분선  이상하게 들어갔어
                    for (int i = 0; i < ArrayUtil.size(studentsArr); i++) {
                        System.out.println("==================================");
                        studentsArr[i].showInfo(); // for안에 들어가야 같이 돌지,,,
                        System.out.println("==================================");
                    }
                    System.out.println();
                
                }else {
                    System.out.println("입력된 정보가 없습니다.");
                }

            } else if (userChoice == 3) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }

        }

        scanner.close();
    }
}
