package day0311;
// 사용자가 2가지 숫자를 입력하면

// 해당 숫자를 산술연산하여 출력하는 프로그램을 만드시오

// 단 + - 는 메소드가 출력까지 담당하고
// * / % 는 메소드가 결과값을 리턴만 해줍니다
// 또한 / 의 경우 결과값이 실수의 형태가 나오도록 메소드 작성

import java.util.Scanner;

public class Calculator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 1");
        System.out.print(">  ");
        int number = scanner.nextInt();

        System.out.println("숫자 2");
        System.out.print(">  ");
        int number2 = scanner.nextInt();

        System.out.println();

        plus(number, number2);
        
        minus(number, number2);

        System.out.println("A * B = " + multiply(number, number2));

        System.out.println("A / B = " + divide(number, number2));

        System.out.println("A % B = " + remain(number, number2));


        scanner.close();
    }

    public static void plus(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    public static void minus(int a, int b) {
        System.out.println("a - b = " + (a - b));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static double remain(int a, int b) {
        return (double) a % b;
    }

}
