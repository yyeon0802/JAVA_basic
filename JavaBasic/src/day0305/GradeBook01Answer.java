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

public class GradeBook01Answer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 우리가 while 문 안에 있는
        // if 코드 블락에서 정보를 입력한 것이
        // while이 반복되더라도 남아있게 하기 위해서는
        // while문 이전에 선언과 초기화를 한번씩 다 해주어야 한다.
        
        // 사용할 변수의 선언과 초기화(초기화를 해,,,)
        int id = 0;
        String name = new String(); //""이거 넣지마 걍 ()임,, !
        int korean = 0;
        int english = 0;
        int math = 0;
        
        // 사용자가 한번이라도 입력을 했는지 저장할 boolean 변수
        boolean inputChecker = false;
        
        while(true) {
            System.out.println("1. 성적입력 2. 성적출력 3.종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if ( userChoice == 1 ) {
                // 성적 입력 코드 구현
                // 번호 입력
                System.out.println("번호를 입력해 주세요.");
                System.out.print("> ");
                id = scanner.nextInt();
                
                // 이름 입력
                scanner.nextLine();
                System.out.println("이름음 입력해 주세요.");
                System.out.print("> ");
                name = scanner.nextLine();
                
                
                // 임시로 사용자의 입력을 받아서
                // 올바른 점수인지 체크하여
                // 올바른 점수이면 각각의 점수에 다시 할당해줄
                // int 변수 선언
                int userInput = 0;
                
                // 국어 점수 입력
                System.out.println("국어 점수를 입력하세요.");
                System.out.print("> ");
                userInput = scanner.nextInt();
                
                while( !(userInput >= 0 && userInput <= 100) ) {
                    System.out.println("점수를 잘못 입력하셨습니다.");
                    System.out.println("국어 점수를 입력하세요.");
                    System.out.print("> ");
                    userInput = scanner.nextInt();
                }
                korean = userInput;
                
                System.out.println("영어 점수를 입력하세요.");
                System.out.print("> ");
                userInput = scanner.nextInt();
                
                while( !(userInput >= 0 && userInput <= 100) ) {
                    System.out.println("점수를 잘못 입력하셨습니다.");
                    System.out.println("영어 점수를 입력하세요.");
                    System.out.print("> ");
                    userInput = scanner.nextInt();
                }
                english = userInput;
                
                System.out.println("수학 점수를 입력하세요.");
                System.out.print("> ");
                userInput = scanner.nextInt();
                
                while( !(userInput >= 0 && userInput <= 100) ) {
                    System.out.println("점수를 잘못 입력하셨습니다.");
                    System.out.println("수학 점수를 입력하세요.");
                    System.out.print("> ");
                    userInput = scanner.nextInt();
                }
                math = userInput;
                
                inputChecker = true;
                
            }else if ( userChoice == 2) {
                // 성적 출력 코드 구현
                
                // inputChecker의 값을 확인하여
                // true일 경우 사용자가 1번기능인
                // 성적입력을 실행을 한번이라도 했다는 의미이므로 출력을 하고
                // 만약 false 일 경우에는 사용자가 한번도 입력을 안했다는 의미가 되므로
                // 경고 메시지만 출력해주면 된다.
                
                // boolean 타입일 경우,
                // 굳이 비교 연산자를 사용해서
                // true 인지 false인지 비교를 하지 않아도
                // 그 자체 안에 저장된 값이 true/false 값이므로
                // 우리가 아래처럼 조건식에 그 자체를 넣어줄 수 있다.
                
                if(inputChecker) {
                    // 굳이 밖에 나올 필요XX 출력할때나 필요함.
                    int sum = korean + english + math;
                    double average = sum / 3.0;
                    
                    System.out.printf("번호 : %03d번  이름 : %s\n", id, name);
                    System.out.printf("국어 : %03d점  영어 : %03d점  수학 : %03d점\n", korean, english, math);
                    System.out.printf("총점 : %03d점  평균 : %06.2f점\n", sum, average);
                }else {
                    System.out.println("아직 입력된 성적이 존재하지 않습니다.");
                }
                
                
            }else if ( userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }            
        }

        scanner.close();
    }
}
