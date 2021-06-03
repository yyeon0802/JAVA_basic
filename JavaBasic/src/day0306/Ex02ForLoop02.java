package day0306;

// 1. 1~10까지 차례대로 출력하시오
// 2. 15~3까지 차례대로 출력하시오
// 3. 1~20 까지 짝수만 출력하시오
// 4. 사용자로 부터 숫자를 입력받아서 1부터 그 수까지 출력하시오
// 5. 사용자로 부터 2개의 숫자를 입력 받아서 더 작은 숫자부터 더 큰 숫자까지 
//      차례대로 출력하시오
// 6. 사용자로부터 숫자를 입력받아서 1부터 그 수까지의 합을 출력하시오.
// 7. 사용자로부터 숫자를 입력받아서 1부터 그 수까지의 곱을 출력하시오.

import java.util.Scanner;

public class Ex02ForLoop02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">>1.");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println(">>2.");
        for (int i = 15; i >= 3; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println(">>3.");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(">>4.");
        System.out.println("자연수를 입력해 주세요 : ");
        System.out.print("> ");
        int inputNumber = scanner.nextInt();

        for (int i = 1; i <= inputNumber; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println(">>5.");
        System.out.println("1)숫자를 입력해 주세요 : ");
        System.out.print("> ");
        int userNumber1 = scanner.nextInt();

        System.out.println("2) [1)과 중복입력 하지마세요] 숫자를 입력해 주세요 : ");
        System.out.print("> ");
        int userNumber2 = scanner.nextInt();

        int startNumber = 0;
        int endNumber = 0;

        if (userNumber1 > userNumber2) {
            startNumber = userNumber2;
            endNumber = userNumber1;
        } else {
            startNumber = userNumber1;
            endNumber = userNumber2;
        }

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println(">>6.");
        System.out.println("자연수를 입력해 주세요 : ");
        System.out.print("> ");
        inputNumber = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= inputNumber; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println();
        System.out.println();
        System.out.println(">>7.");
        System.out.println("자연수를 입력해 주세요 : ");
        System.out.print("> ");
        inputNumber = scanner.nextInt();

        int multipleNumber = 1;
        for (int i = 1; i <= inputNumber; i++) {
            multipleNumber *= i;
        }
        System.out.println(multipleNumber);

        scanner.close();
    }
}
