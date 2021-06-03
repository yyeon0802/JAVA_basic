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
public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용할 변수 선언 및 초기화
        double height = 0.0;
        double weight = 0.0;
        boolean inputChecker = false;
        
        while ( true ) {
            // 메뉴 실행
            System.out.println("===========BMI 계산기==========");
            System.out.println("1) 정보입력 2) BMI 확인 3) 종료");
            System.out.print(">> 실행할 번호를 선택하세요 : ");
            int userChoice = scanner.nextInt();
            
            // userChoice에 따른 실행
            if ( userChoice == 1 ) {
                // 정보입력 1)키
                System.out.println("[정보입력] 키(m단위)를 입력하세요.");
                System.out.print(">> ");
                height = scanner.nextDouble();
                
                // 단위에 따른 값이 맞는지 확인
                while( !(height > 0 && height <= 2.82) ) {
                    System.out.println("잘못 입력하셨습니다. 다시 확인 하세요.");
                    System.out.println("[정보입력] 키(m단위)를 입력하세요.");
                    System.out.print(">> ");
                    height = scanner.nextDouble();
                }
                
                // 통과하면 2)몸무게 입력
                System.out.println("[정보입력] 몸무게(kg단위)를 입력하세요.");
                System.out.print(">> ");
                weight = scanner.nextDouble();
                
                // 단위에 따른 값이 맞는지 확인
                while( !(weight > 0 && weight <= 635) ) {
                    System.out.println("잘못 입력하셨습니다. 다시 확인 하세요.");
                    System.out.println("[정보입력] 몸무게(kg단위)를 입력하세요.");
                    System.out.print(">> ");
                    weight = scanner.nextDouble();
                }
                
                inputChecker = true;
                System.out.println("[정보입력] 이 완료되었습니다.");
                System.out.println("[BMI 확인] 메뉴를 실행하세요");
                
            }else if ( userChoice == 2) {
                
                // 정보입력을 했는가 체크
                if (inputChecker) {
                    //inputChecker가 true -> bmi 계산 실행
                    double bmi = weight / height / height;
                    System.out.printf("당신의 BMI 수치 : %.2f \n" , bmi );
                    
                    //bmi에 따른 비만도 판별 및 출력
                    if ( bmi < 18.5 ) {
                        System.out.println("[저체중] 입니다.");
                    }else if ( bmi < 23 ) {
                        System.out.println("[정상체중] 입니다.");
                    }else if ( bmi < 25 ) {
                        System.out.println("[과체중] 입니다.");
                    }else {
                        System.out.println("[비만] 입니다.");
                    }
                }else {
                    //inputChecker가 false
                    System.out.println("정보가 입력되지 않았습니다. 먼저 입력 하세요.");
                }
            }else if ( userChoice == 3) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }
        }
        
        scanner.close();
    }
}
