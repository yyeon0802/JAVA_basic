package day0310;

//char 2차원 배열을 통한 별찍기 1번

import java.util.Scanner;
public class StarPrinter01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수 입력");
        System.out.print(">  ");
        int userNumber = scanner.nextInt();
        
        // 출력할 내용을 저장할 char[][]
        char[][] stars = new char[userNumber][userNumber];
        
        for ( int i = 0; i < stars.length; i++ ) {
            for ( int j = 0; j <= i; j++) { //범위조심
                stars[i][j] = '*';
            }
        }
        for ( int i = 0; i < stars.length; i++ ) {
            for ( int j = 0; j <stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
        
        
        
        scanner.close();
    }
}
