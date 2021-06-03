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
public class GuessingGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 메뉴 만들고
        // 메뉴선택하고
        // 컴퓨터가 랜덤한 숫자 받고 ( 1~100)
        // 숫자 맞출거 입력
        // me 입력받고 
        // me 범위에 맞는지 검증하고
        // 플레이 해서 com == me 할때 까지 while
        // 맞추는게 아니고 turn이 늘어난다고 생각하자 
        // bestScore가 갱신되면 바꿔라 (if) score가 turn의 개념이라 "작아야"한다
        
        //  while 밖에 저장하여 필요한 변수?
        // com  me bestScore 입력했는지 확인할 inputChecker = false
        // while 안에 변수
        // turn으로 하자,,, 
        
        int comNum = 0; // 얘네들 밖에 만들 필요가 없었다...
        int userNum = 0; // while 안에서 계속 돌것들,,,
        int bestScore = 0;
        boolean inputChecker = false;
        
        while (true) {
            
            System.out.println("======== Guessing Game ========");
            System.out.println(">>> MENU <<<");
            System.out.println("1) 게임 시작");
            System.out.println("2) 최고 기록 보기");
            System.out.println("3) 종료");
            System.out.print(">> 메뉴번호 선택 : ");
            int userChoice = scanner.nextInt();
            
            if ( userChoice == 1 ) {
                
                comNum = random.nextInt(100) + 1;
                System.out.println("[com]이 숫자를 선택했습니다. 1 ~ 100 자연수를 맞춰보세요 ! ");
                
                int turn = 0;
                
                System.out.print("[me] 1 ~ 100 선택 : ");
                userNum = scanner.nextInt();
                turn++;
                System.out.println("------------------------------");
                
                while ( !(userNum >= 1 && userNum <= 100) ) {
                    System.out.println("잘못 입력하셨습니다. 범위를 확인하세요.");
                    System.out.print("[me] 1 ~ 100 선택 : ");
                    userNum = scanner.nextInt();                        
                    System.out.println("------------------------------");
                }
                 
                // 헐 한번만 써도 된다 ㅠㅠㅠ // 범위체크 안함 헐
                while ( userNum != comNum ) { // !( == ) 이짓을 왜해,, ㅠ
                    if ( userNum > comNum ) {
                        System.out.println("DOWN !");
                    }else if ( userNum < comNum ) { // 걍 else로 잡아도 무방한듯
                        System.out.println("UP !");
                    }
                    System.out.print("[me] 1 ~ 100 선택 : ");
                    userNum = scanner.nextInt();
                    turn++;
                    System.out.println("------------------------------");
                   
                    while ( !(userNum >= 1 && userNum <= 100) ) {
                        System.out.println("잘못 입력하셨습니다. 범위를 확인하세요.");
                        System.out.print("[me] 1 ~ 100 선택 : ");
                        userNum = scanner.nextInt();                        
                        System.out.println("------------------------------");
                    }
                }
                
                if ( userNum == comNum ) { //한줄로 줄여서,, ||이거 쓰면 되잖음???
                    if( bestScore == 0 ) {
                        bestScore = turn;
                    }else if ( bestScore > turn ) {
                        bestScore = turn;
                    }
                    
                    System.out.println("정답 !");
                    System.out.printf("[com] : %d / [me] : %d\n" , comNum, userNum );
                    System.out.printf("시도 횟수 : %d번\n", turn );
                    System.out.println("------------------------------");
                    System.out.println("최고기록을 확인 하실 수 있습니다.");
                    System.out.println("===============================");
                    
                    inputChecker = true;
                }
                
            }else if ( userChoice == 2 ) {
                if ( inputChecker ) {
                    System.out.println(">> 현재 최고 기록");
                    System.out.printf(" %d 번 입니다 !\n" , bestScore);
                    System.out.println("===============================");
                    
                }else {
                    System.out.println("아직 플레이 기록이 없습니다.");
                    System.out.println("===============================");
                }
                
            }else if ( userChoice == 3 ) {
                System.out.println(">> 게임을 종료합니다.");
                break;
            }
        }
        
        scanner.close();
    }
}
