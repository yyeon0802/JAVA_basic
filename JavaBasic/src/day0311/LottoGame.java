package day0311;
// 로또 게임 최종

// 사용자로 부터 몇번을 입력할건지 입력을 받고
// 각 게임을 수동으로 할지 자동으로 할지 입력받아서
// 최종적으로 컴퓨터의 숫자와 비교하여 각 게임의 맞춘 등수를 출력하게 하시오.

// 예시
// 몇번 플레이 하시겠습니까? 5번
// 1번게임을 수동or자동 중 어떤걸로 하시겠습니까?(1:수동 2:자동)
// 2
// 2번게임을 수동 자동중 어떤거로?
// 1
// 첫번째 숫자를 입력해 주세요 : 33;

// 컴퓨터의 숫자 : [##, ##, ##, ##, ##, ##]
// 사용자의 숫자 
// 1번 게임 : [##, ##, ##, ##, ##, ##] - 4개 3등
// n번 게임 : [##, ##, ##, ##, ##, ##] - 5개 2등
// n번 게임 : [##, ##, ##, ##, ##, ##] - 6개 1등
// n번 게임 : [##, ##, ##, ##, ##, ##] - 3개 4등
// n번 게임 : [##, ##, ##, ##, ##, ##] - 0개 등수 없음

import java.util.Scanner;
import java.util.Random;
public class LottoGame {
    static final int LOTTO_SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println(">>>> 로또 당첨기 <<<<");
        System.out.println("몇번 플레이 하시겠습니까 ? ");
        System.out.print(">  ");
        int playSet = scanner.nextInt();
        
        int[] computerLotto = new int[LOTTO_SIZE];
        int[][] userLotto = new int[playSet][LOTTO_SIZE];
        int[] correctArray = new int[playSet];
        int[] winArray = new int[playSet];
        
        int lottoIndex = 0;
        while( lottoIndex < playSet ) {
            System.out.printf("%d번 게임을 어떻게 진행 하시겠습니까? 1)수동 / 2)자동\n" , lottoIndex + 1);
            System.out.print(">  ");
            int select = scanner.nextInt();
            
            if(select == 1) {
                int lottoCnt = 0;
                while (lottoCnt < 6) {
                    System.out.printf("<수동> %d번 게임) 숫자를 입력하세요(%d) : " , lottoIndex + 1 , lottoCnt + 1);
                    int userNumber = scanner.nextInt();
                    
                    int check = 0;
                    for (int i = 0; i < userLotto.length; i++) {
                        for (int j = 0; j < userLotto[i].length; j++) {
                            for (int k = 0; k < j; k++ ) {
                                if ( userNumber == userLotto[i][k] ) {
                                    check = -1;
                                }
                            }
                        }
                    }
                    
                    if (!(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX && check == 0)) {
                        System.out.println("중복이거나 잘못된 숫자를 입력하셨습니다. 확인하세요.");
                    }else {
                        userLotto[lottoIndex][lottoCnt] = userNumber;
                        lottoCnt++;                
                    }                    
                }    
                
                lottoIndex++;
                
            }else if ( select == 2) {
                
                for ( int i = lottoIndex; i <= lottoIndex; i++) {
                    for (int j = 0; j < userLotto[i].length; j++) {
                        int randomNumber = random.nextInt(NUMBER_MAX) + 1;
                        for( int k = 0; k < j; k++ ) {
                            if ( randomNumber == userLotto[i][k] ) {
                                k = -1;
                                j--;
                            }
                        }
                        userLotto[i][j] = randomNumber;
                    }
                }
                
                System.out.printf("<자동>으로 로또 생성 되었습니다.\n"); 
                lottoIndex++;
            }
        }
        
        // 컴퓨터로또 뽑기
        System.out.println();
        System.out.println();
        
        for ( int i = 0; i < computerLotto.length; i++) { //answer에 커다란 for와 같다
            int comRandom = random.nextInt(NUMBER_MAX) + 1;
            for (int j = 0; j < i; j++ ) {
                if ( comRandom == computerLotto[j] ) {
                    i--;
                }
            }
            computerLotto[i] = comRandom;
        }
        
        // 정렬해서 출력
        // 컴퓨터
         for ( int i = 0; i < computerLotto.length - 1; i++) {
             if ( computerLotto[i] > computerLotto[i + 1] ) {
                 int temp = computerLotto[i];
                 computerLotto[i] = computerLotto[i + 1];
                 computerLotto[i + 1] = temp;
                 i = -1;
             }
         }

         
         // 나정렬
         
         for ( int i = 0; i < userLotto.length; i++) {
             for (int j = 0 ; j < userLotto[i].length - 1; j++ ) {
                 if ( userLotto[i][j] > userLotto[i][j + 1] ) {
                     int temp = userLotto[i][j];
                     userLotto[i][j] =  userLotto[i][j + 1];
                     userLotto[i][j + 1] = temp;
                     j = -1;
                 }
             }
         }
         
         // 출력 후 비교
         int playCnt = 0;
         while ( playCnt < playSet) {
             int correctCnt = 0;    
             /*for (int i = 0; i <= playCnt; i++ ) {
                 for (int j = 0; j <= playCnt; j++) {
                     if( computerLotto[j] ==  userLotto[playCnt][j] ) {
                         correctCnt++;
                     }
                 }
             }*/
             
             for ( int i = 0; i < computerLotto.length; i++) {
                 for (int j = playCnt; j <= playCnt; j++) {
                     for ( int k = 0; k < userLotto[j].length; k++) {
                         if ( computerLotto[i] == userLotto[j][k]) {
                             correctCnt++;
                         }
                     }
                 }
             }
             int win = LOTTO_SIZE - correctCnt;
             correctArray[playCnt] = correctCnt;
             winArray[playCnt] = win;
             playCnt++;             
         }
         
         
         System.out.print("컴퓨터의 숫자 : [");
         for (int i = 0; i < computerLotto.length; i++) {
             if ( i == computerLotto.length - 1 ) {
                 System.out.print(computerLotto[i]);
             } else {
                 System.out.print(computerLotto[i] + ", ");
             }
         }
         System.out.print("]");
         System.out.println();
         
         for (int i = 0; i < userLotto.length; i++) {
             System.out.print("사용자의 숫자 : [");
             for (int j = 0; j < userLotto[i].length; j++) {
                 if ( j == userLotto[i].length - 1 ) {
                     System.out.print(userLotto[i][j]);
                 } else {
                     System.out.print(userLotto[i][j] + ", ");
                 }
             }
             System.out.print("] -- " + correctArray[i] + "개 " + winArray[i] + "등");
             System.out.println();
         }
        scanner.close();
    }
}
