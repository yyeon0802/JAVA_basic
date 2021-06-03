package day0305;
// bmi checker를 

//입력과 출력으로 나눈 메뉴버전으로 고치시오

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

import java.util.Scanner;

public class Homework01Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 키, 몸무게, 입력 스위치 변수 선언 및 초기화
        double height = 0;
        double weight = 0;
        boolean inputSwitch = false;

        while (true) {
            System.out.println("1. 키 몸무게 입력");
            System.out.println("2. 결과 확인");
            System.out.println("3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // 키 몸무게 입력 코드 구현
                // 1)키 입력
                System.out.println("키를 입력하세요.");
                System.out.print("> ");
                height = scanner.nextDouble();

                // 2)키검증
                while (!(height > 0 && height <= 2.82)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("키를 입력하세요.");
                    System.out.print("> ");
                    height = scanner.nextDouble();
                }

                // 3)몸무게 입력
                System.out.println("몸무게를 입력하세요.");
                System.out.print("> ");
                weight = scanner.nextDouble();

                // 4)몸무게 검증
                while (!(weight > 0 && weight <= 635)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("몸무게를 입력하세요.");
                    System.out.print("> ");
                    weight = scanner.nextDouble();
                }

                // 5)입력 스위치 true로 변경
                inputSwitch = true;

            } else if (userChoice == 2) {
                // 출력 코드 구현
                if (inputSwitch) {
                    double bmi = weight / height / height;
                    System.out.printf("당신의 BMI 수치 : %.2f \n", bmi);

                    if (bmi < 18.5) {
                        System.out.println("[저체중] 입니다.");
                    } else if (bmi < 23) {
                        System.out.println("[정상체중] 입니다.");
                    } else if (bmi < 25) {
                        System.out.println("[과체중] 입니다.");
                    } else {
                        System.out.println("[비만] 입니다.");
                    }
                } else {
                    System.out.println("아직 입력된 정보가 없습니다!");
                }

            } else if (userChoice == 3) {
                // 메세지 출력 후 종료
                System.out.println("사용해 주셔서 감사합니다.");
                break;
            }
        }

        scanner.close();
    }
}
