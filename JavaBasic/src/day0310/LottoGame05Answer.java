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
public class LottoGame05Answer {
    static final int SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // computerArray
        int[] computerArray = new int[SIZE];
        // userArray
        int[] userArray = new int[SIZE];
        
        // 입력할 index를 저장할 int 변수 index
        int idx = 0;
        
        // 1. 컴퓨터 숫자 배열 숫자 넣기
        //     A.  while() 사용해서 idx가 6보다 작은동안 랜덤 숫자 생성해서 배열에 없으면 추가
        
        while ( idx < SIZE ) {
            int randomNumber = random.nextInt(6) + 1;
            
            // 랜덤숫자 중복 체크
            boolean numberChecker = true;
            
            // for문 사용해서
            // computerArray의 각 엘리먼트를 체크
            // 같은 엘리먼트 있을경우 numberCheckr = false;
            for ( int i = 0; i < computerArray.length; i++) {
                if ( randomNumber == computerArray[i] ) {
                    numberChecker = false;
                    break;
                }
            }
            // numberChecker == true 일 경우
            // computerArray의 idx 인덱스에 randomNumber할당해 주고
            // idx++
            
            if(numberChecker) {
                computerArray[idx] = randomNumber;
                idx++;
            }
            
        }
        //     B.  for() 사용해서 정렬
        for ( int i = 0; i < computerArray.length - 1; i++) {
            if ( computerArray[i] > computerArray[i+1] ) {
                int temp = computerArray[i];
                computerArray[i] = computerArray[i+1];
                computerArray[i+1] = temp;
                i = -1;
            }
        }
        
        // 2. 사용자 숫자 배열 로또숫자 넣기
        idx = 0;
        //      A. while() 사용해서 idx가 6보다 작은동안 사용자한테 숫자 입력받아서 올바른 범위에 속하고 배열에 없으면 추가

        while ( idx < SIZE ) {
            // 1. 사용자한테 숫자를 입력 받는다.
            System.out.println( (idx+1) + "번째 숫자" );
            System.out.print("> ");
            int userNumber = scanner.nextInt();
            
            // 사용자의 숫자가 중복인지 아닌지를 확인하여 중복이면 false 아니면 true 할당하는
            boolean inputChecker = true;
            
            // 2. 사용자의 숫자를 검증하고, 올바르지 않으면 다시 입력 받는다.
            while ( !(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX) ) {
                System.out.println("잘못된 값입니다.");
                System.out.println( (idx+1) + "번째 숫자");
                System.out.print("> ");
                userNumber = scanner.nextInt();
            }
            
            // 3. 사용자의 숫자가 중복인지 체크한다.
            for ( int i = 0; i < userArray.length; i++) {
                if ( userNumber == userArray[i] ) {
                    inputChecker = false;
                    break;
                }
            }
            
            // 4. 중복이 아니면 idx칸에 할당하고 idx++, 중복이면 경고 메세지만 출력 
            
            if (inputChecker) {
               userArray[idx] = userNumber;
               idx++;
            }else {
                System.out.println("이미 입력된 중복 숫자입니다.");
            }
        }
        //      B. for 사용해서 정렬
        for ( int i = 0; i < userArray.length - 1; i++) {
            if ( userArray[i] > userArray[i+1] ) {
                int temp = userArray[i];
                userArray[i] = userArray[i+1];
                userArray[i+1] = temp;
                i = -1;
            }
        }
        
        // 3. 몇개가 맞았는지 확인
        // 맞은 갯수를 저장할 int count
        int count = 0;
        for ( int i = 0; i < userArray.length; i++ ) {
            for ( int j = 0; j < computerArray.length; j++) {
                if ( userArray[i] == computerArray[j] ) {
                    count++;
                }
            }
        }
        
        
        // 4. 결과 출력
        System.out.printf("사용자의 숫자 :[%2d, %2d, %2d, %2d, %2d, %2d]\n", 
                userArray[0] , userArray[1] , userArray[2] , userArray[3] , userArray[4] , userArray[5]); 
        
        System.out.printf("컴퓨터의 숫자 :[%2d, %2d, %2d, %2d, %2d, %2d]\n", 
                computerArray[0] , computerArray[1] , computerArray[2] , computerArray[3] , computerArray[4] , computerArray[5]); 
        
        System.out.println("맞은 갯수 : " + count + "개");
        System.out.println("등수 : " + (SIZE - count + 1) + "등");
        
        scanner.close();
    }
}
