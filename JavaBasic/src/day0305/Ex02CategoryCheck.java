package day0305;

// 사용자로 부터 성별, 나이, 신체등급순으로 입력받아서
// 남성이고 19세 이상일시
// 1~3 : 현역
// 4: 공익
// 그외 : 면제 가 되는 프로그램 작성
// 단 성별 입력시 숫자값으로 입력을 받아 1이면 남자 2면 여자로 판정

// 단 여성일 시 추가적인 정보 입력없이
// "여성에게는 국방의 의무가 부여되지 않습니다."라는 메세지 출력

// 남자이지만 미성년자 일경우
// "아직 신체등급이 부여되지 않았습니다." 메세지 출력

import java.util.Scanner;

public class Ex02CategoryCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[정보입력] 1)남성 2)여성 본인이 해당하는 성별의 숫자를 입력하세요");
        System.out.print("> ");
        int gender = scanner.nextInt();

        if (gender == 1) {

            System.out.println("당신은 남성입니다.");
            System.out.println("[나이입력] 본인의 나이를 입력하세요");
            System.out.print("> ");
            int age = scanner.nextInt();

            if (age > 18) {
                System.out.println("성인 입니다.");
                System.out.println("[신체등급입력] 본인의 신체등급을 입력하세요");
                System.out.print("> ");
                int physicalGrade = scanner.nextInt();

                if (physicalGrade > 4) {
                    System.out.println("[판정] 면제 입니다.");
                } else if (physicalGrade == 4) {
                    System.out.println("[판정] 공익 입니다.");
                } else {
                    System.out.println("[판정] 현역 입니다.");
                }

            } else {
                System.out.println("미성년자 입니다.");
                System.out.println("아직 신체등급이 부여되지 않았습니다.");
            }

        } else if ( gender == 2 ) { //선택지가 있으므로 else로 묶어버리지 말자
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
        }

        scanner.close();
    }
}
