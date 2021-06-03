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

public class Ex02ForLoop02Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println(">>1.");

        // i의 초기화 변수와 종료 조건식에서 쓸 변수를 만들어서 사용해 보자
        int start = 1;
        int end = 10;

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println(">>2.");

        start = 15;
        end = 3;
        for (int i = start; i >= end; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println(">>3.");

        start = 1;
        end = 20;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println(">>4.");
        System.out.println("숫자를 입력해 주세요 : ");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        start = 1;
        end = userNumber;

        for (int i = 1; i <= userNumber; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println(">>5.");
        System.out.println("1)숫자를 입력해 주세요 : ");
        System.out.print("> ");
        userNumber = scanner.nextInt();

        System.out.println("2) [1)과 중복입력 하지마세요] 숫자를 입력해 주세요 : ");
        System.out.print("> ");
        int userNumber2 = scanner.nextInt();

        if (userNumber <= userNumber2) {
            start = userNumber;
            end = userNumber2;
        } else {
            start = userNumber2;
            end = userNumber;
        }

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println(">>6.");
        //합을 저장할 int 변수
        int result = 0;
        
        System.out.println("숫자를 입력해 주세요 : ");
        System.out.print("> ");
        userNumber = scanner.nextInt();
        
        for (int i = 1; i <= userNumber; i++) {
            result += i;
        }
        System.out.printf("1부터 [%d]까지의 합 : [%d]\n", userNumber, result);

        System.out.println();
        System.out.println();
        System.out.println(">>7.");
        // 곱을 저장할 result를 1로 초기화 한다.
        result = 1;
        
        System.out.println("숫자를 입력해 주세요 : ");
        System.out.print("> ");
        userNumber = scanner.nextInt();
        
        for (int i = 1; i <= userNumber; i++) {
            result *= i;
        }
        System.out.printf("1부터 [%d]까지의 곱 : [%d]\n", userNumber, result);

        // 20까지 곱하면 오버플로우 -가된다,,, 범위 조심
        scanner.close();
    }
}
