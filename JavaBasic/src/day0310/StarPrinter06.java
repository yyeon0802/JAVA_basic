package day0310;
// 별찍기 6번

import java.util.Scanner;
public class StarPrinter06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("별찍기 6번");
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        int maxLength = 2 * userNumber - 1;
        char[][] stars = new char[userNumber][maxLength];
        
        for ( int i = 0; i < stars.length; i++) {
            for ( int j = 0; j < i; j++) {
                stars[i][j] = ' ';
            }
            for ( int j = i; j <  maxLength - i; j++) {
                stars[i][j] = '*';
            }
        }

        for(int i = 0; i < stars.length; i++) {
            for ( int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
        scanner.close();
 
    }
}
