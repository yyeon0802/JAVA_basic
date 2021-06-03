package day0306;
// 숫자 맞추기 게임

// 1. 플레이 기능
//    플레이 기능에는 컴퓨터가 1 ~ 100 사이의 랜덤한 숫자를 하나 뽑고
//    사용자가 그 숫자를 맞추는 기능이 구현되어 있다.
//    사용자가 컴퓨터가 뽑은 숫자를 맞출 때 까지 계속 입력을 하되
//    사용자의 숫자가 더 클 경우에는 DOWN 이라는 메세지가 출력이 되고
//    사용자의 숫자가 더 작을 경우에는 UP 이라는 메세지가 출력이 된다.
//    또한, 사용자가 입력 할 때마다 점수가 1씩 추가 되서
//    결국 몇번만에 맞췄는지 점수가 나오고
//    해당 점수가 최고기록보다 "작으면" 그 점수가 새로운 최고 기록이 된다.

// 2. 최고기록 보기 기능
//    현재까지 플레이한 기록 중 가장 최고 기록을 보여준다.
//    단, 사용자가 플레이 했던 기록이 없을 경우 "아직 플레이 기록이 없습니다."라는 간단 메세지 출력해준다.

// 3. 종료 기능
//    프로그램 종료

import java.util.Scanner;
import java.util.Random;
public class GuessingGameAnswer {
    // 오,,, 상수선언!
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 100;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 최고점수를 저장할 변수
        //홀,, 처음 0인걸 이용해서 사용자의 플레이 기록 유무 판정으로 사용할 수 있다.
        int bestScore = 0; 
        
        while(true) {
            System.out.println();
            System.out.println("1. 플레이");
            System.out.println("2. 최고기록");
            System.out.println("3. 종료");
            System.out.println();
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if ( userChoice == 1 ) {
                // 플레이 코드 구현
                
                // 현재점수 변수 선언 / 이걸 여기서...
                int currentScore = 0;
                
                // 1. 컴퓨터 숫자 결정 / 반복되는 숫자 상수로 써라
                int computerNumber = random.nextInt(NUMBER_MAX) + 1;
                
                // 2. 사용자의 입력
                //  a. 숫자입력(1~100까지 검증)
                System.out.println("1부터 100사이의 숫자를 입력해 주세요.");
                System.out.print("> ");
                int userNumber = scanner.nextInt();
                
                while( !(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX) ) {
                    System.out.println("잘못 입력 하셨습니다.");
                    System.out.println("1부터 100사이의 숫자를 입력해주세요");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();
                }
                currentScore++;
                
                //  b. 컴퓨터 숫자와 같을 때까지 입력
                while( computerNumber != userNumber ) {
                    // 컴퓨터 숫자와 사용자위 숫자를 비교해서
                    // UP 혹은 DOWN둘 중 하나를 출력해준다.
                    if ( computerNumber > userNumber ) {
                        System.out.println("UP");
                    }else {
                        System.out.println("DOWN");
                    }
                    System.out.println("1부터 100사이의 숫자를 입력해 주세요.");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();
                    
                    while( !(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX) ) {
                        System.out.println("잘못 입력 하셨습니다.");
                        System.out.println("1부터 100사이의 숫자를 입력해주세요");
                        System.out.print("> ");
                        userNumber = scanner.nextInt();
                    }
                    currentScore++;
                }
                //  c. 입력할 때마다 현재 점수 1 추가
                
                // 3. 이번판 결과 출력
                //     A. 축하 메세지
                System.out.println("정답입니다!");
                //     B. 현재 점수 출력
                System.out.printf("사용자의 이번 라운드 기록 : %3d\n", currentScore);
                //     C. 최고 기록 출력
                if ( bestScore != 0 ) {
                    System.out.printf("현재 최고 기록 : %3d\n", bestScore);
                }
                //     D. 최고 기록 결정
                if ( currentScore < bestScore || bestScore == 0) { // || 연산자로 해서 붙여도 된다
                    System.out.println("새로운 최고 기록을 달성했습니다.");
                    bestScore = currentScore;
                }
                
                
            }else if ( userChoice == 2) {
                // 최고 기록 보기 코드 구현
                if(bestScore > 0 ) {
                    System.out.println();
                    System.out.printf("사용자의 최고 기록 : %3d\n" , bestScore);
                    System.out.println();
                }else {
                    System.out.println();
                    System.out.println("아직 플레이 기록이 없습니다.");
                    System.out.println();
                }
            }else if ( userChoice == 3) {
                System.out.println("플레이 해주셔서 감사합니다!");
                break;
            }
        }
        
        
        
        
        
        scanner.close();
    }
}
