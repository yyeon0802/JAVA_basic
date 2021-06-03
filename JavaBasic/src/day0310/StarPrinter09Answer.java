package day0310;

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
        
        
        int maxLength = 2 * userNumber - 1;
        char[][] stars = new char[maxLength][maxLength];

        for (int i = 0; i < stars.length; i++) {
            if ( i < userNumber ) {
                for (int j = 0; j <= userNumber - i-1; j++) {
                    stars[i][j] = ' '; 
                }
                for (int j = userNumber - i - 1; j < userNumber + i; j++) {
                    stars[i][j] = '*';
                }
            } else {
                int lowerI = i - userNumber + 1;
                
                for ( int j = 0; j <= lowerI; j++) {
                    stars[i][j] = ' ';
                }
                
                for ( int j = lowerI; j < maxLength - lowerI; j++ ) {
                    stars[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
 
    }
}
