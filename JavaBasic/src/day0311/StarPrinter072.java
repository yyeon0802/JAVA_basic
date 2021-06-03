package day0311;

//별찍기 7번을
//가변혁 2차원 배열로 만들어 보자

import java.util.Scanner;

public class StarPrinter072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("별찍기 5번)");
        System.out.println("출력한 줄 수");
        System.out.print(">  ");
        int userNumber = scanner.nextInt();

        char[][] stars = new char[userNumber][];

        for (int i = 0; i < stars.length; i++) {
            stars[i] = new char[userNumber + i];
            int startPoint = userNumber - i - 1;
            for (int j = startPoint; j < stars[i].length; j++) {
                stars[i][j] = '*';
            }
        }

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
    }
}
