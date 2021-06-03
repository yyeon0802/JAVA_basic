package day0306;
// 별찍기 1번

import java.util.Scanner;
public class StarPrinter01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력하시오");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        for ( int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for ( int j = 1; j <= i; j++) {
                stars += "*";
            }
            
            System.out.println(stars);        
        }
       
        
        scanner.close();
    }
}
