package day0305;
// 사용자로부터 번호, 이름, 국어, 영어, 수학을 입력받아

// 다음과 같은 양식으로 출력해주는 프로그램

//번호 : ###번 이름 : ###
//국어 : 0##점 영어 : 0##점 수학 : 0##점
//총점 : 0##점 평균 : 0##.##점

// 단, 입력 기능과 출력 기능을 분리하여
// 사용자가 입력을 선택했을 때에만 입력을 하게되고
// 사용자가 출력을 선택했을때에만 출력을 하게 하는 프로그램을 만드시오
// 또한 사용자가 잘못된 점수를 입력했을 경우, 올바른 점수를 입력할 때까지 다시 입력을 받도록 하세요.

// 생각해 볼것 : 변수의 선언 위치
// 심화문제 : 사용자가 아무런 정보 입력 없이 출력을 누르면 
//          "아직 아무런 입력이 되지 않았습니다"
//          라는 메세지만 출력되게 프로그램을 작성하시오.

import java.util.Scanner;

public class GradeBook01 {
    static final double SUBJECTS_SIZE = 3.0; //constant대문자ㅏㅏㅏ

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int id = 0;
        String name = new String("");
        int korean = 0;
        int english = 0;
        int math = 0;
        int sum = 0;
        double average = 0;
        
        int check = -1;
        
        while (true) {
            

            System.out.println("============= 성적 관리 ==============");
            System.out.println(">>>>>> 메뉴 <<<<<<");
            System.out.println("1) 데이터입력 2) 성적출력 3)종료");
            System.out.print("> 번호를 선택하세요 : ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("[정보입력] 시작합니다.");
                System.out.print("번호 : ");
                id = scanner.nextInt();
                System.out.println();

                scanner.nextLine();
                System.out.print("이름 : ");
                name = new String(scanner.nextLine());
                System.out.println();

                System.out.print("국어 성적 : ");
                korean = scanner.nextInt();
                while (!(korean >= 0 && korean <= 100)) {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    System.out.print("국어 성적 : ");
                    korean = scanner.nextInt();
                }

                System.out.println();
                System.out.print("영어 성적 : ");
                english = scanner.nextInt();
                while (!(english >= 0 && english <= 100)) {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    System.out.print("영어 성적 : ");
                    english = scanner.nextInt();
                }

                System.out.println();
                System.out.print("수학 성적 : ");
                math = scanner.nextInt();
                while (!(math >= 0 && math <= 100)) {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    System.out.print("수학 성적 : ");
                    math = scanner.nextInt();
                }

                sum = korean + english + math;
                average = sum / SUBJECTS_SIZE;

                check = 1;

            } else if (choice == 2) {
                if (check < 0) {
                    System.out.println("정보가 입력되지 않았습니다. 성적 출력 불가.");
                    System.out.println();
                } else if (check > 0) {
                    System.out.printf("번호 : %03d번  이름 : %s \n", id, name);
                    System.out.printf("국어 : %03d점  영어 : %03d점  수학 : %03d점 \n", korean, english, math);
                    System.out.printf("총점 : %03d점  평균 : %06.2f점 \n", sum, average);
                }
            } else if ( choice == 3 ) {
                System.out.println("종료.");
                break;
            }
        }

        scanner.close();
    }
}
