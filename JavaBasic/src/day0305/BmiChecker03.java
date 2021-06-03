package day0305;

//사용자로 부터 키와 몸무게를 입력받아서
//사용자의 bmi수치를 소수점 2번째 자리까지 출력하고
//bmi = 몸무게(kg)/ 키(m) / 키(m)
//체형 기준은
//~18.5 미만 : 저체중
//~23 미만   : 정상체중
//~25 미만   : 과체중
//그외   : 비만

//기네스기록 가장 큰 키 2.82m
//기네스기록 가장 무거운 몸무게 635kg

// 만약 사용자가 잘못된 키 혹은 몸무게를 입력할시
// 유효한 키, 몸무게를 입력할 때까지 다시 입력을 받으세요 

import java.util.Scanner;

public class BmiChecker03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========BMI 계산기========");
        System.out.println("[정보입력] 키(m)를 입력하세요.");
        System.out.print("> ");
        double height = scanner.nextDouble();

        while (!(height > 0 && height <= 2.82)) {
            System.out.println("키를 잘못 입력하셨습니다. 확인하세요.");
            System.out.println();
            System.out.println("[정보입력] 키(m)를 입력하세요.");
            System.out.print("> ");
            height = scanner.nextDouble();
        }

        System.out.println("[정보입력] 몸무게(kg)를 입력하세요.");
        System.out.print("> ");
        double weight = scanner.nextDouble();

        while (!(weight > 0 && weight <= 635)) {
            System.out.println("몸무게를 잘못 입력하셨습니다. 확인하세요.");
            System.out.println();
            System.out.println("[정보입력] 몸무게(kg)를 입력하세요.");
            System.out.print("> ");
            weight = scanner.nextDouble();
        }

        // BMI 계산

        double bmi = weight / height / height;

        System.out.printf("BMI 지수 : %.2f \n", bmi);

        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi < 23) {
            System.out.println("정상체중입니다.");
        } else if (bmi < 25) {
            System.out.println("과체중입니다.");
        } else {
            System.out.println("비만입니다.");
        }

        scanner.close();
    }
}
