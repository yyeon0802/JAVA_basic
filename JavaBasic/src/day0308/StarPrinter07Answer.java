package day0308;

// 별찍기 7번 for문 2개로 만들기

import java.util.Scanner;
public class StarPrinter07Answer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("별찍기 7번(for문 2개)");
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
       
        /*
        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for (int j = 1; j <= i; j++ ) {
                stars += "*";
            }
            System.out.println(stars);      
        }
        for ( int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = userNumber - 1; j >= i; j--) {
                stars += "*";
            }
            System.out.println(stars);
        }
        */
        
        
        // 윗부분을 담당하는 i for 문
        for ( int i = 1; i <= userNumber - 1; i++) {
            String stars = new String();
            for ( int j = 1; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        // 아랫부분을 담당하는 i for 문
        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        scanner.close();
 
    }
}
