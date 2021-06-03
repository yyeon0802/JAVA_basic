package day0308;


import java.util.Scanner;
public class StarPrinter07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        for (int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            
            if ( i < userNumber ) {
                for ( int j = 1; j <= i; j++) {
                    stars += "*";
                }
            }else { // 5 6 7 8 9
                int lowerI = i - userNumber + 1; // 다시 1부터 돌리고 싶다
                for ( int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
            }            
            System.out.println(stars);
        }
        
        
        scanner.close();
 
    }
}
