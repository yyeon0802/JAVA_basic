package day0310;
// 별찍기 3번

import java.util.Scanner;

public class StarPrinter03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("별찍기 3번");
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print(">  ");
        int userNumber = scanner.nextInt();

        System.out.println();

        char[][] stars = new char[userNumber][userNumber];

        for (int i = 0; i < userNumber; i++) {
            for (int j = 0; j <= userNumber - i - 1; j++) {
                stars[i][j] = ' '; 
            }
            for (int j = userNumber - 1; j >= userNumber - i -1; j--) {
                stars[i][j] = '*';
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
