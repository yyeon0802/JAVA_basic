package day0308;
//별찍기 4번

import java.util.Scanner;
public class StarPrinter04Answer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        /*
         * for ( int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for (int j = userNumber; j >= i; j-- ) {
                stars += "*";
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
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
            for ( int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        
        scanner.close();
 
    }
}
