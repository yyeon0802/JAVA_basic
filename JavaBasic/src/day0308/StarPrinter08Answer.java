package day0308;

// 별찍기 08번 하나의 for문으로 

import java.util.Scanner;
public class StarPrinter08Answer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("별찍기 8번");
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        /*
        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = userNumber - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++ ) {
                stars += "*";
            }
            System.out.println(stars);      
        }
        for ( int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for ( int k = userNumber - 1; k >= i; k--) {
                stars += "*";
            }
            System.out.println(stars);
        }*/
        
        for ( int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            if ( i < userNumber) {
              //윗부분
                 // 공백을 담당하는 jFor문
                for (int j = 1; j <= userNumber - i; j++) {
                    stars += " ";
                }
                // 별을 담당하는 jFor문
                for ( int j = 1; j <= i; j++) {
                    stars += "*";
                }
            }else { 
             // 아랫부분
                // else에 왔다는 것은
                // i가 userNumber보다 크거나 같다라는 이야기
                // 즉 userNumber가 5일때
                // i = 5 ~ 9가 여기 들어온다
                
                // 하지만 기존의 우리 j for문은 항상
                // i가 1~5의 기준으로 진행이 됨.
                // 그렇기 때문에 기존 j for문을 그대로 쓰면 모양이 일그러진다.
                
                // 해법 1) 여기 else로 들어오는 i를 기준으로 해서 j for문 고친다.
                //     - 단점 : 코드가 복잡해짐, 기존에 썼던  j for을 새로 만드는 것과 같다. 
                // 해법 2) else 에서 쓸 1부터 시작하는 새로은 변수를 만들어서 i와 userNumer로
                //        j for문에서 활용 해 준다.
                //     - 메모리 충분한시대 필요한 만큼 변수 선언해서 사용하자
            
                
                // 공백을 담당하는 jFor문
                for ( int j = 1; j <= i - userNumber; j++) {
                    stars += " ";
                }
                int lowerI = i - userNumber + 1; // 마치 1 2 3 4 5,,,
                for ( int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
            }
            
            System.out.println(stars);
        }
        
        scanner.close();
 
    }
}
