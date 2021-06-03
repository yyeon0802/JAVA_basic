package day0308;
// 별찍기 5번

import java.util.Scanner;
public class StarPrinter05Answer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        /*
        int n = 1;
        for ( int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = userNumber; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++ ) {
                stars += "*";
            }
            System.out.println(stars);
            n += 2;
        }
        */

        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            
            // 공백을 담당하는 j for 문
            for ( int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }
            // 별을 담당하는 j for문
            for ( int j = 1; j <= 2*i - 1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
            
        scanner.close();
 
    }
}
