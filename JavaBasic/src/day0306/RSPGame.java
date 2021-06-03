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
public class RSPGame {

    static final int MIN_NUM = 1;
    static final int MAX_NUM = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int playCnt = 0; //win lose tie 다 더해도 되겠는디,,,
        int win = 0;
        int lose = 0;
        int tie = 0;
        
        while(true) {
            System.out.println("========가위바위보 게임=========");
            System.out.println("1) 플레이 2) 결과 출력 3) 종료");
            System.out.print(">> ");
            int userChoice = scanner.nextInt();
            
            if (userChoice == 1 ) {
                
                int comSelect = random.nextInt(3) + 1;
                
                System.out.println("[me] 1)가위 2)바위 3)보 를 입력 하세요");
                System.out.print(">> ");
                int userSelect = scanner.nextInt();
                
                while ( !(userSelect >= MIN_NUM && userSelect <= MAX_NUM) ) {
                    
                    System.out.println("잘못 입력하셨습니다. 다시 확인하세요.");
                    System.out.println("[me] 1)가위 2)바위 3)보 를 입력 하세요");
                    System.out.print(">> ");
                    userSelect = scanner.nextInt();                    
                }
                
                
                if ( userSelect == 1 ) {
                    if ( comSelect == 2 ) {
                        System.out.println("졌다 ! ");
                        lose++;
                    }else if ( comSelect == 3 ) {
                        System.out.println("이겼다 ! ");
                        win++;
                    }
                }
                
                if ( userSelect == 2 ) {
                    if ( comSelect == 3 ) {
                        System.out.println("졌다 ! ");
                        lose++;
                    }else if ( comSelect == 1 ) {
                        System.out.println("이겼다 ! ");
                        win++;
                    }
                }
                
                if ( userSelect == 3 ) {
                    if ( comSelect == 1 ) {
                        System.out.println("졌다 ! ");
                        lose++;
                    }else if ( comSelect == 2 ) {
                        System.out.println("이겼다 ! ");
                        win++;
                    }
                }
                
                if ( userSelect == comSelect ) {
                    System.out.println("무승부 ! ");
                    tie++;
                } // 이 뒤에 else 문으로 묶어서 했어어도,, else 안에 다시 if 로 !
                
                playCnt++;
                
                System.out.println();
                System.out.println(">> 결과확인 1)가위 2)바위 3)보");
                System.out.printf("컴퓨터 선택 : %d  |  나의 선택 : %d\n" , comSelect , userSelect);
                System.out.println();
                
            }else if(userChoice == 2 ) {
                if ( playCnt == 0 ) {
                    System.out.println("아직 게임결과가 없습니다. 게임을 시작해 주세요.");
                }else {
                    
                    double victory  = (double)win / playCnt;
                    
                    System.out.println(">>총 게임 결과");
                    System.out.printf(" %03d전 %03d승 %03d무 %03d패 (승률 : %6.2f%%)\n" , playCnt, win, tie, lose, victory * 100);
                }
            }else if (userChoice == 3 ) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
        
        scanner.close();
    }
}
