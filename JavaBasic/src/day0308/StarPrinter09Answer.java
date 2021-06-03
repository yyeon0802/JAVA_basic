package day0308;

//별찍기 9번

import java.util.Scanner;
public class StarPrinter09Answer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("별찍기 9번");
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        /*
        int n = 1;        
        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = userNumber; j > i; j--) {
                System.out.print(" ");
            }
            for ( int k = 1; k <= n; k++) {
                stars += "*";
            }
            n += 2;
            System.out.println(stars);
        }
        
        n = userNumber + (userNumber - 2);
        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = n; j > i; j--) {
                stars += "*";
            }
            for ( int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            n--;
            System.out.println(stars);
        }
        */
       
        for ( int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            // 윗부분
            if ( i < userNumber ) {
                // 공백
                for (int j = 1; j <= userNumber - i; j++) {
                    stars += " ";
                }
                // 별
                for ( int j = 1; j <= 2 * i - 1; j++) {
                    stars += "*";
                }                
            }else {
            // 아랫부분
                int lowerI = 2 * userNumber - i; // 마치 5 4 3 2 1
                // 공백
                for ( int j = 1; j <= userNumber - lowerI; j++) {
                    stars += " ";
                }
                // 별
                for ( int j = 1; j <= 2 * lowerI - 1; j++) {
                    stars += "*";
                }
            }
            
            System.out.println(stars);
        }
        
        scanner.close();
 
    }
}
