package day0315;
// 객체를 이용한 성적관리 프로그램
// 단 지금은 당장은 한명의 정보만 입력하고 출력해보자.
import java.util.Scanner;
import util.ScannerUtil;
public class GradeBook02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 정보를 저장할 Student객체를 생성 및 초기화
        Student s = new Student();
        
        //객체의 필드 혹은 메소드를 접근할 때에는
        // 객체. 으로 접근하게 된다.
        // 그래서 . 은 자바에서는 접근 연산자 라고도 부른다.
        
         s.id = ScannerUtil.nextInt(scanner, "번호를 입력하시오.");
         s.name = ScannerUtil.nextLine(scanner, "이름을 입력하시오.");
         s.korean = ScannerUtil.nextInt(scanner, "국어 점수를 입력하시오.", 0, 100);
         s.english = ScannerUtil.nextInt(scanner, "영어 점수를 입력하시오.", 0, 100);
         s.math = ScannerUtil.nextInt(scanner, "수학 점수를 입력하시오.", 0, 100);
        
         // 정보를 출력할 때에는 별 다른거 할 거 없이
         // 그냥 Student 클래스의 객체인 s의 showInfo()만 실행해 주면 된다.
         s.showInfo();
         
        scanner.close();
    }
}
