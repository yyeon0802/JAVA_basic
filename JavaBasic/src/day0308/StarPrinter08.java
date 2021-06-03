package day0308;


import java.util.Scanner;
public class StarPrinter08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        for ( int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            if ( i < userNumber ) {
                for ( int j = i; j <= userNumber - 1; j++) {
                    stars += " ";
                }
                for ( int j = 1; j <= i; j++) {
                    stars += "*";
                }
            }else { // i = 5 6 7 8
                for (int j = 1; j <= i - userNumber; j++) {
                    stars += " ";
                }
                int lowerI = i - userNumber + 1;
                for ( int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
            }
            
            System.out.println(stars);
        }
       
        scanner.close();
 
    }
}
