package day0305;

// 무한 루프를 사용해서 프로그램의 메뉴를 만들어보자

import java.util.Scanner;
public class Ex08Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
         
            System.out.println("1)1번기능 2)2번기능 3)3번기능 4)종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if ( userChoice == 1 ) {
                //1번 기능 코드 구현
                
            } else if (userChoice == 2) {
                //2번 기능 코드 구현
            } else if (userChoice == 3) {
                //2번 기능 코드 구현
            } else if (userChoice == 4 ) {
                //메세지 출력 후 종료
                System.out.println("사용해주셔 감사합니다.");
                break;
            }
            
        }
        
        
        
        scanner.close();
    }
    
}
