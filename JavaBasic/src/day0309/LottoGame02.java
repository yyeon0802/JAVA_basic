package day0309;

// 로또 게임 2번
// 1 ~ 45의 랜덤한 숫자를 크기가 6인 배열에 넣어주고 출력해주는 프로그램
// + 중복 제거 알고리즘 추가

import java.util.Random;
public class LottoGame02 {
    static final int MAX_NUMBER = 45;
    static final int SIZE = 6;
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println(">>> 중복 없는 로또 번호 생성 <<<");
        
        int[] lotto = new int[SIZE];
        
        //while 안에 있어야지.....
        
        /* 1. while 
        int idx = 0;
        while ( idx < lotto.length ) {
            
            // 이 안에 있어야 계속 돌아서 넣어들어간다
            int lottoNumber = random.nextInt(MAX_NUMBER) + 1;
            boolean numberChecker = true;
            
            for ( int i = 0; i < lotto.length; i++) {
                if ( lottoNumber == lotto[i] ) {
                    numberChecker = false;
                    break;
                }
            }
            
            if ( numberChecker ) {
                lotto[idx] = lottoNumber;
                idx++;
            }
        }
        */
        
        // 2. 안 쓰는 2중 for i--랑 j = -1두개있음
        
        // 위의 식으로 하려면 미리 로또번호 만들어줘야 한다
        
        for ( int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(MAX_NUMBER) + 1;
        }
        // 위에 만든걸 중복검사다시 1) j = -1  버전
        
        for ( int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto.length; j++) {
                if ( i != j && lotto[i] == lotto[j] ) {
                    lotto[i] = random.nextInt(MAX_NUMBER) + 1;
                    System.out.printf("[%d]번 [%d]번 중복으로 값교체\n" , i , j);
                    j = -1;
                }
            }
        }
        
        
        for ( int i = 0; i < lotto.length; i++) {
            System.out.printf("로또번호 [%d]번 : %2d\n", i, lotto[i]);
        }
        
    }

}
