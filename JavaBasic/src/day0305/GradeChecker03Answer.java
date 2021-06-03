package day0305;

//사용자로 부터 점수를 입력받아서
//A B C D F 가 출력되는 프로그램 작성

//90점 이상   : A
//80점대     : B
//70점대     : C
//60점대     : D
//그외       : F

// 단 사용자가 잘못된 점수를 입력할 경우
// 올바른 점수를 입력할 때까지 다시 입력 받으세요

import java.util.Scanner;
public class GradeChecker03Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("점수를 입력해주세요.");
        System.out.print("> ");
        int score = scanner.nextInt();
        
        while ( !(score >= 0 && score <= 100) ) {
            System.out.println("잘못 입력 하셨습니다.");
            System.out.println("점수를 입력해주세요.");
            System.out.print("> ");
            score = scanner.nextInt();
        }
        
        if ( score >= 90 ) {
            System.out.println("[A]");
        }else if ( score >= 80 ) {
            System.out.println("[B]");
        }else if ( score >= 70 ) {
            System.out.println("[C]");
        }else if ( score >= 60 ) {
            System.out.println("[D]");
        }else {
            System.out.println("[F]");
        }
       
        
        scanner.close();
    }
}
