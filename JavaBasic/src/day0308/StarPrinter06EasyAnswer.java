package day0308;
// 별찍기 6번

import java.util.Scanner;
public class StarPrinter06EasyAnswer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("별찍기 6번");
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        char[][] stars = new char[userNumber][2 * userNumber - 1];

        for (int i = 0; i < stars.length; i++) {
            for (int j = i; j < 2 * userNumber - 1 - i; j++) {
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
