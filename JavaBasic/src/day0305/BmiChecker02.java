package day0305;

//사용자로 부터 키와 몸무게를 입력받아서
//사용자의 bmi수치를 소수점 2번째 자리까지 출력하고
//bmi = 몸무게(kg)/ 키(m) / 키(m)
//체형 기준은
//~18.5 미만 : 저체중
//~23 미만   : 정상체중
//~25 미만   : 과체중
//  그외   : 비만

// 기네스기록 가장 큰 키 2.82m
// 기네스기록 가장 무거운 몸무게 635kg

// 키를 잘못 입력하면 추가적인 입력 없이 경고 메세지만 출력하시오
// 몸무게를 잘못 입력하면 결과 출력대신 경고 메세지만 출력하시오

// 값 검증이 포함됨

import java.util.Scanner;

public class BmiChecker02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== BMI계산기 ===========");
        System.out.println("[정보입력] (m단위) 키를 입력하세요");
        System.out.print(">  ");
        double height = scanner.nextDouble();

        // 올바른 범위의 키를 입력받았는가 0빼래,,,
        if (height > 0 && height <= 2.82) {

            // 올바른 키 입력 후 올바른 범위의 몸무게를 입력하자
            System.out.println("[정보입력] (kg단위) 몸무게를 입력하세요");
            System.out.print(">  ");
            double weight = scanner.nextDouble();

            // 올바른 범위의 몸무게를 입력받았는가
            if (weight > 0 && weight <= 635) {
                // bmi를 계산하자
                double bmi = weight / height / height;

                if (bmi < 18.5) {
                    System.out.printf("BMI 지수 : %.2f [저체중] 입니다. \n", bmi);
                } else if (bmi < 23) {
                    System.out.printf("BMI 지수 : %.2f [정상체중] 입니다. \n", bmi);
                } else if (bmi < 25) {
                    System.out.printf("BMI 지수 : %.2f [과체중] 입니다. \n", bmi);
                } else {
                    System.out.printf("BMI 지수 : %.2f [비만] 입니다. \n", bmi);
                }

            } else {
                System.out.println("[error] 잘못 입력 하셨습니다. (단위확인)");
            }

        } else {
            System.out.println("[error] 잘못 입력 하셨습니다. (단위확인)");
        }

        scanner.close(); // 빼먹지말라고요,,,
    }
}
