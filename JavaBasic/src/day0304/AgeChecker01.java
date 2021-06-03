package day0304;
// 사용자로 부터 나이를 입력 받아서
// ~5 이하  : 영아
// ~13 이하 : 어린이
// ~18 이하 : 청소년
// 그외  : 성인
// 이 출력되는 프로그램 작성하시오

import java.util.Scanner;
public class AgeChecker01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(">> 나이 판별) 나이를 입력 하시오 : ");
        int age = scanner.nextInt();
        
        /*
         else는 맨 위의 if만 반대되는 것이 아닌 else if문 전부다
         에 제외된 것을 잡는다. 오름차순 혹은 내림 차순 순서대로 다시 할것 !   
        */
        if ( age <= 5 ) {
            System.out.println("[영아] 입니다.");
        } else if ( age <= 13 ) {
            System.out.println("[어린이] 입니다.");
        } else if ( age <= 18 ) {
            System.out.println("[청소년] 입니다.");
        } else {
            System.out.println("[성인] 입니다.");
        }
        
        System.out.println(">>> 프로그램 종료");
        scanner.close();
    }
}
