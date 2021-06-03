package day0308;
//별찍기 06번 HARD ver.

import java.util.Scanner;
public class StarPrinter06HardAnswer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        /*
        int n = userNumber+(userNumber-1);
        for ( int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = 1; j < i; j++ ) {
                System.out.print(" ");
            }
            for ( int k = n; k >= i; k--) {
                stars += "*";
            }
            n--;
            System.out.println(stars);
        }
        */
        
        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            // 공백을 담당하는 j for 문
             for ( int j = 1; j <= i - 1; j++) {
                 stars += " ";
             }
            
            // 별을 담당하는 j for 문
             for ( int j = 1; j <= 2 * userNumber - 2 * i + 1; j++) {
                 stars += "*";
             }
            
            System.out.println(stars);
        }
        
        scanner.close();
 
    }
}
