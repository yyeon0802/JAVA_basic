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

public class BmiChecker02Answer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("키를 m단위로 입력하세요");
        System.out.print("> ");
        double height = scanner.nextDouble();

        if (height > 0 && height <= 2.82) {
            // 올바른 키이므로 몸무게를 입력받겠다.
            System.out.println("몸무게를 kg 단위로 입력하세요");
            System.out.print("> ");
            double weight = scanner.nextDouble();

            if (weight > 0 && weight <= 635) {
                // 올바른 키와 몸무게가 입력 되었으므로
                // BMI를 계산하여 BMI와 체형을 출력해준다.
                double bmi = weight / height / height;

                // 밖으로 빼지,,,
                System.out.printf("BMI 지수 : %.2f \n" , bmi );
                
                if (bmi < 18.5) {
                    System.out.println("[저체중] 입니다.");
                } else if (bmi < 23) {
                    System.out.println("[정상체중] 입니다. ");
                } else if (bmi < 25) {
                    System.out.println("[과체중] 입니다. ");
                } else {
                    System.out.println("[비만] 입니다. ");
                }
                
            } else {
                // 올바르지 않은 몸무게 이므로 경고 메시지만 출력한다.
                System.out.println("잘못된 몸무게 입니다.");
            }

        } else {
            // 올바르지 않은 키 이므로 경고 메세지만 출력한다
            System.out.println("잘못된 키 입니다.");
        }

        scanner.close();

    }
}
