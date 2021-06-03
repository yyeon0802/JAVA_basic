package day0308;

// 쉬운버전 6. 반전 기억

import java.util.Scanner;
public class StarPrinter06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        for ( int i = userNumber; i >= 1; i--) {
            String stars = new String();
            for ( int j = i; j <= userNumber - 1; j++) {
                stars += " ";
            }
            for ( int j = 1; j <= 2 * i - 1; j++ ) {
                stars += "*";
            }
            System.out.println(stars);
        }
       
        scanner.close();
 
    }
}
