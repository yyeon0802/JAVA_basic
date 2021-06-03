package day0310;
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

        char[][] stars = new char[userNumber][userNumber];

        for ( int i = 0 ; i < stars.length; i++ ) {
            for ( int j = 0; j < stars[i].length; j++) {
                // 공백을 담당하는 if 문
                if ( j < userNumber - (i+1) ) {
                    stars[i][j] = ' ';
                }else {
                    // 별을 담당하는 else 문
                    stars[i][j] = '*';
                }
            }
            
        }
        /*
        for ( int i = 0 ; i < stars.length; i++ ) {
            // 공백을 담당하는 if 문
            for ( int j = 0; j < userNumber - (i + 1); j++) {
                stars[i][j] = ' ';
            }
            for ( int j = userNumber - (i + 1); j < userNumber; j++) {
                stars[i][j] = '*';
            }
            // 별을 담당하는 else 문
        }*/

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
        
        
        scanner.close();

    }
}
