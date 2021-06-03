package day0309;

// 로또게임

// 사용자로부터 숫자 6개를 입력받은 후 정렬해서 출력하시오
// 단, 사용자가 잘못된 숫자 혹은 중복된 숫자를 입력하면
// 올바른 숫자를 입력할 때까지 다시 입력을 받도록 하시오.

import java.util.Scanner;
import java.util.Random;
public class LottoGame04 {
    static final int SIZE = 6; //이거 length 로 해도?
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 45;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println(">>> 로또 번호 내가 뽑기 <<<");
       
        
        int[] lottoNumbers = new int[SIZE];
        
        int idx = 0;
        while ( idx < lottoNumbers.length ) {
            
            System.out.println("로또 번호를 입력 하세요.");
            System.out.print("(1~45) > ");
            int userNumber = scanner.nextInt();
            
            
            if ( userNumber < MIN_NUMBER || userNumber > MAX_NUMBER ) {
                boolean userChecker = true;
                while (userChecker) {
                    System.out.println("[메세지] 잘못된 번호를 입력하셨습니다. 확인하세요.");
                    System.out.println("로또 번호를 입력 하세요.");
                    System.out.print("(1~45) > ");
                    userNumber = scanner.nextInt();
                    
                    if (!(userNumber < MIN_NUMBER || userNumber > MAX_NUMBER)) {
                        userChecker = false;
                    }
                }
                
            } else {
                //확인하고 넣자
                boolean numberChecker = true;
                for ( int i = 0; i < lottoNumbers.length; i++) {
                    if ( userNumber == lottoNumbers[i]) {
                        System.out.println("[메세지] 중복된 번호를 입력하셨습니다. 확인하세요.");
                        numberChecker = false;
                        break; // i for문 break
                    }
                }
                
                if ( numberChecker ) {
                    lottoNumbers[idx] = userNumber;
                    idx++;
                }
            }
        }
        // 정렬하자
        
        for (int i = 0; i < lottoNumbers.length - 1; i++) {
            if ( lottoNumbers[i] > lottoNumbers[i+1] ) {
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i+1];
                lottoNumbers[i+1] = temp;
                i = -1;
            }
        }
           
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf(">%d. 입력한 로또 번호 : [%2d]\n" , i+1 , lottoNumbers[i]);
        }
        
        
        
    }
}
