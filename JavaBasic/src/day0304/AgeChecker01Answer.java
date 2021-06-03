package day0304;
// 사용자로 부터 나이를 입력 받아서
// ~5 이하  : 영아
// ~13 이하 : 어린이
// ~18 이하 : 청소년
// 그외  : 성인
// 이 출력되는 프로그램 작성하시오 ->if 문의 방향성을 지켜라 

import java.util.Scanner;
public class AgeChecker01Answer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("나이");
        System.out.print("> ");
        int age = scanner.nextInt();
        
        if ( age <= 5 ) {
            System.out.println("영아 입니다.");
        } else if ( age <= 13 ) {
            System.out.println("어린이 입니다.");
        } else if ( age <= 18 ) {
            System.out.println("청소년 입니다.");
        } else {
            System.out.println("성인 입니다.");
        }
        
        System.out.println(">>> 프로그램 종료");
        scanner.close();
    }
}
