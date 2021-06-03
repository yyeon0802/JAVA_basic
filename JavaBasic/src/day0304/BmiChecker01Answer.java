package day0304;

// 사용자로 부터 키와 몸무게를 입력받아서
// 사용자의 bmi수치를 소수점 2번째 자리까지 출력하고
// bmi = 몸무게(kg)/ 키(m) / 키(m)
// 체형 기준은
// ~18.5 미만 : 저체중
// ~23 미만   : 정상체중
// ~25 미만   : 과체중
//     그외   : 비만

import java.util.Scanner;
public class BmiChecker01Answer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("키(m) 입력하세요.");
        System.out.print("> ");
        double height = scanner.nextDouble();

        System.out.println("몸무게(kg) 입력하세요.");
        System.out.print("> ");
        double weight = scanner.nextDouble();
        
        double bmi = weight / height / height;
        
        System.out.printf("사용자의 BMI 수치 : [%.2f] \n", bmi);
        
        if( bmi < 18.5 ) {
            System.out.println("저체중입니다.");
        } else if ( bmi < 23 ) {
            System.out.println("정상체중입니다.");
        } else if ( bmi < 25 ) {
            System.out.println("과체중입니다.");
        } else {
            System.out.println("비만입니다.");
        }
        
        System.out.println(">>> 프로그램 종료");
        scanner.close();
    }
}
