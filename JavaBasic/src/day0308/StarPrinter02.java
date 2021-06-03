package day0308;

// 별찍기 2번 

import java.util.Scanner;
public class StarPrinter02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        for ( int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        scanner.close();
 
    }
}
