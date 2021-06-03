package day0306;

// 가위바위보게임
// 사용자는 1은 가위, 2는 바위 3은 보 로 해서
// 컴퓨터와 가위바위보 게임을 한다.

// 1. 플레이
//      사용자가 1~3 사이의 숫자를 고르고
//      컴퓨터가 1~3 사이의 숫자를 고르고 나서
//      결과를 확인해서
//      승리, 무승부, 패배 3가지 중 하나를 결정해서
//      기록하라

// 2. 출력
//      출력은 플레이 기록이 존재할 경우 한다
//      ###전 ###승 ###무 ###패 (승률 : ##.###%)  퍼센트 출력?
//      printf 에서 글자 %를 출력하려면 %% 라고 적으면 %글자로 출력이된다!

// 3. 종료


import java.util.Random;
import java.util.Scanner;
public class RSPGameAnswer {

    static final int OPTION_SIZE = 3;
    static final int OPTION_SCISSOR = 1;
    static final int OPTION_ROCK = 2;
    static final int OPTION_PAPER = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 승 ,무 , 패 를 저장할 int 변수
        int win = 0;
        int draw = 0;
        int lose = 0;
        
        while(true) {
            System.out.println("1. 플레이하기");
            System.out.println("2. 기록보기");
            System.out.println("3. 종료");
            int userChoice = scanner.nextInt();
            
            if ( userChoice == 1 ) {
                // 플레이 코드 구현
                
                //1. 컴퓨터 숫자 추첨
                int computerNumber = random.nextInt(OPTION_SIZE) + 1;
                
                //2. 사용자 숫자 입력
                //   단 사용자가 입력한 숫자가 유효한 숫자인지 체크
                System.out.println("1.가위 2.바위 3.보");
                System.out.print("> ");
                int userNumber = scanner.nextInt();
                
                while( !(userNumber >= OPTION_SCISSOR && userNumber <= OPTION_PAPER) ) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("1.가위 2.바위 3.보");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();                    
                }
                
                //3. 컴퓨터와 사용자의 숫자비교 후 결과 결정 및 출력
                
                // 각각 고른 선택지를 출력 해주기
                if(userNumber == OPTION_SCISSOR) {
                    System.out.printf("사용자의 선택 : [%s]\n", "가위");
                }else if (userNumber == OPTION_ROCK) {
                    System.out.printf("사용자의 선택 : [%s]\n", "바위");
                }else if (userNumber == OPTION_PAPER) {
                    System.out.printf("사용자의 선택 : [%s]\n", "보");
                }
                
                if(computerNumber == OPTION_SCISSOR) {
                    System.out.printf("컴퓨터의 선택 : [%s]\n", "가위");
                }else if (computerNumber == OPTION_ROCK) {
                    System.out.printf("컴퓨터의 선택 : [%s]\n", "바위");
                }else if (computerNumber == OPTION_PAPER) {
                    System.out.printf("컴퓨터의 선택 : [%s]\n", "보");
                }
                
                if ( userNumber == computerNumber ) {
                    // 두 숫자가 같다라는 것은
                    // 무승부라는 의미가 된다.
                    System.out.println("무승부 입니다.");
                  draw++;
                }else {
                    // 무승부가 아닐경우
                    // 사용자의 값에 대해 각각의 처리를 해준다.
                    if ( userNumber == OPTION_SCISSOR) {
                        // 사용자가 가위를 선택했을 경우
                         if( computerNumber == OPTION_ROCK) {
                             System.out.println("졌습니다.");
                             lose++;
                         }else if (computerNumber == OPTION_PAPER) {
                             System.out.println("이겼습니다.");
                             win++;
                         }
                    }else if ( userNumber == OPTION_ROCK) {
                        // 사용자가 바위를 선택했을 경우
                        if (computerNumber == OPTION_SCISSOR) {
                            System.out.println("이겼습니다.");
                            win++;
                        }else if(computerNumber == OPTION_PAPER) {
                            System.out.println("졌습니다.");
                            lose++;
                        }
                    }else if (userNumber == OPTION_PAPER) {
                        // 사용자가 보를 선택했을 경우
                        if ( computerNumber == OPTION_SCISSOR) {
                            System.out.println("졌습니다.");
                            lose++;
                        }else if( computerNumber == OPTION_ROCK) {
                            System.out.println(" 이겼습니다.");
                            win++;
                        }
                    }
                }
                
                
                
            }else if ( userChoice == 2) {
                // 기록 보기 코드 구현
                int total = win + draw + lose;
                
                if ( total > 0 ) {
                    //플레이 한 전적이 존재하므로 출력
                    double winRate = (double) win / total;
                    System.out.printf(" %03d전 %03d승 %03d무 %03d패 (승률 : %6.2f%%)\n" , total, win, draw, lose, winRate * 100);
                    
                }else {
                    // 플레이 한 전적이 없으므로 경고 메세지만 출력
                    System.out.println("아직 플레이한 기록이 없습니다.");
                }
                
            }else if (userChoice == 3) {
                // 종료
                System.out.println("플레이해주셔 감사합니다.");
                break;
            }
        }
        
        
        scanner.close();
    }
}
