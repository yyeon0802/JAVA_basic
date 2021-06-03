package day0308;
// 별찍기 3번

import java.util.Scanner;
public class StarPrinter03Answer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("별찍기 3번");
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print(">  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        /*
        for ( int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for (int j = userNumber-1; j >= i; j-- ) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        */
        
        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            // 공백을 담당하는 j for 문
            for (int j = i; j <= userNumber - 1; j++) {
                stars += " ";
            }
            // 별을 담당하는 j for 문
            for ( int j = 1; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        scanner.close();
 
    }
}
