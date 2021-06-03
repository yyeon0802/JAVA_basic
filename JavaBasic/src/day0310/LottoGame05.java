package day0310;

// 사용자가 입력한 로또 번호와
// 컴퓨터가 만들어낸 로또 번호를 비교하여
// 사용자 숫자 : [## ,##, ##, ##, ##, ##]
// 컴퓨터 숫자 : [## ,##, ##, ##, ##, ##]
// 총 맞춘 숫자 : #개
// 등수 : # 등
// 이 출력되는 프로그램을 작성하시오

// 등수기준
// 6개 - 1등
// 5개 - 2등
// 4개 - 3등
// 3개 - 4등
// 2개 - 5등

import java.util.Random;
import java.util.Scanner;
public class LottoGame05 {
    static final int SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // 컴퓨터 랜덤 로또번호 저장할 배열 생성
        
        int[] meLotto = new int[SIZE];
        int[] comLotto = new int[SIZE];
        
        int meIdx = 0;
        int comIdx = 0;
        
        while (comIdx < SIZE) {
            int randomNumber = random.nextInt(NUMBER_MAX) + 1;
            
            int check = 0;
            for ( int i = 0; i < comLotto.length; i++ ) {
                if ( randomNumber == comLotto[i] ) {
                    check = -1;
                    break;
                }
            } // boolean값을 if 로 받으라고,,
            
            //컴퓨터인데 범위 체크를 왜하냐,,,아오
            if( randomNumber >= NUMBER_MIN && randomNumber <= NUMBER_MAX ) {
                 if ( check != -1 ) {
                     comLotto[comIdx] = randomNumber;
                     comIdx++;                
                 }
            }else {
                
            }
        }
        
        System.out.println(">>>> 로또 번호 비교 <<<<");
        System.out.println();
        System.out.println("[com]이 번호 선정을 마쳤습니다.");
        
        // 내가 입력
        
        while ( meIdx < SIZE ) {
            System.out.printf("[me] (1~45) 로또 번호 %d번 입력\n" , meIdx + 1 );
            System.out.print("> ");
            int userNumber = scanner.nextInt();
            
            int check = 0;
            for ( int i = 0; i < meLotto.length; i++ ) {
                if ( userNumber == meLotto[i] ) {
                    check = -1;
                    break;
                }
            }
            
            if ( userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX ) {
                if ( check != -1 ) {
                    meLotto[meIdx] = userNumber;
                    meIdx++;
                }else {
                    System.out.println("중복된 숫자입니다. 확인 하세요.");
                }
            }else {
                System.out.println("입력한 숫자의 범위(1~45)를 확인 하세요.");
            }
        
        }
        
        // 정렬
        // comLotto
        for ( int i = 0; i < comLotto.length - 1; i++ ) {
            if (comLotto[i] > comLotto[i + 1]) {
                int temp = comLotto[i];
                comLotto[i] = comLotto[i + 1];
                comLotto[i + 1] = temp;
                
                i = -1;
            }
        }
        
        // meLotto
        for ( int i = 0; i < meLotto.length - 1; i++ ) {
            if (meLotto[i] > meLotto[i + 1]) {
                int temp = meLotto[i];
                meLotto[i] = meLotto[i + 1];
                meLotto[i + 1] = temp;
                
                i = -1;
            }
        }
        
        
        // 사용자 숫자 : [## ,##, ##, ##, ##, ##]
        // 컴퓨터 숫자 : [## ,##, ##, ##, ##, ##]
        // 총 맞춘 숫자 : #개
        // 등수 : # 등
        
        System.out.println("================= 결과 ===============");
        System.out.print("컴퓨터 숫자 : [");
        for ( int i = 0; i < comLotto.length; i++ ) {
            if( i == SIZE-1 ) {
                System.out.printf("%2d", comLotto[i]);
            }else {
                System.out.printf("%2d , " , comLotto[i]);
            }
        }
        System.out.print("]\n");
        
        System.out.print("나의 숫자 : [");
        for ( int i = 0; i < meLotto.length; i++ ) {
            if( i == SIZE-1 ) {
                System.out.printf("%2d", meLotto[i]);
            }else {
                System.out.printf("%2d , " , meLotto[i]);
            }
        }
        System.out.print("]\n");
        
        int cnt = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if( comLotto[i] == meLotto[j] ) {
                    cnt++;
                }
            }
        }
        
        System.out.printf("총 맞춘숫자 : [%d]개\n" , cnt);
        System.out.println();
        
        if (cnt == SIZE ) { //너무 일일이 썼다...
            System.out.println("등수 : 1등");
        }else if (cnt == SIZE - 1) {
            System.out.println("등수 : 2등");
        }else if (cnt == SIZE - 2) {
            System.out.println("등수 : 3등");
        }else if (cnt == SIZE - 3) {
            System.out.println("등수 : 4등");
        }else if (cnt == SIZE - 4) {
            System.out.println("등수 : 5등");
        }
        System.out.println("====================================");
        
        
        scanner.close();
    }
}
