package day0309;

// 로또 게임 2번
// 1 ~ 45의 랜덤한 숫자를 크기가 6인 배열에 넣어주고 출력해주는 프로그램
// + 중복 제거 알고리즘 추가

import java.util.Random;
public class LottoGame02Answer {
    static final int SIZE = 6;
    static final int NUMBER_MAX = 45;
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(">>> 로또 게임 ver 0.2 <<<");
        
        // []는 배열이라는 데이터 타입을 말한다.
        // 즉 아래의 선언식의 경우
        // "int가 모여있는 int 배열 lottoNumbers를 선언하고 해당 배열크기(=길이) SIZE이다"
        // 라는 의미가 된다. 현재 각 위치는 0이 들어가 있다.
        
        // element vs index
        // - element는 배열 안의 각각의 구성원 말한다.
        //    일반적인 변수의 경우, 우리가 그 변수의 이름을 알고 있기 때문에
        //    그 이름을 통해서 해당 변수에 접근 할 수 있지만.
        //    배열이 경우 우리는 그 변수의 이름을 모른다.
        
        //    그 대신, 배열의 각 칸에는 해당 엘리먼트에 대한 주소값이 저장되어 있다.
        //    따라서, 우리가 해당 엘리먼트에 접근할 때에는(=값을 할당하거나 호출할 때에는)
        //    이름 대신 배열의 해당 칸에 저장되어 있는 주소값을 이용해서 접근하게 되는 것이다.
        //     그때 , 우리가 배열의 몇번째 칸에 접근할 것이니 적어야 하는데
        //    그 몇번째 인지를 우리가 [index]라고 부르는 것이다.
        
        
        // - index는 배열 안의 각각의 구성원 말한다.
        int[] lottoNumbers = new int[SIZE];
        
    
       // 아래의 for문은 우리가 lottoNumbers 배열의 i번째 인덱스마다
       // random.nextInt(NUMBER_MAX) + 1;한 값을 할당해주는 for문
        for (int i = 0; i < lottoNumbers.length; i++) {
            // 아래코드는
            // "lottoNumbers의 i 번째 칸에 저장되어 있는 주소값을 타고 가서
            //  그 공간에 random.nextInt(NUMBER_MAX) + 1 한 결과값을
            // 할당하라는 의미"
            
            lottoNumbers[i] = random.nextInt(NUMBER_MAX) + 1;
        }
        
        System.out.println();
        System.out.println("중복제거 전 ");
        System.out.println();
        
        // 아래의 for문은 우리가
        // lottoNumbers 배열의 i 번째 인덱스에 저장되어 있는 값을 호출해서
        // 화면에 풀력하는 for문이다.
        for (int i = 0; i < lottoNumbers.length; i++) {
            // 아래에서 lottoNumbers[i]라고 적어주는데 이때는
            // lottoNumbers배열의 i번째 칸의 저장된 주소값을 타고 들어가서
            // 그 공간에 저장되었는 int값을 불러오는 것이다.
            
            System.out.printf("lottoNumbers[%d] : [%2d]\n", i, lottoNumbers[i]);
        }
        System.out.println("---------------------------------------------");
        
        // 중복 제거용 2중 for문
        // 1)
        // i와 j가 다르지만 !!!! 인덱스가 다른것이 중요 !!!!
        // lottoNumbers[i] 와 lottoNumbers[j]가 같다는건 중복이므로
        // lottoNumbers[i]에 새로운 값을 넣어주고 다시 처음부터 검사하게 만들어준다.
        
        // 무식한 방법이다
        // 만약 이 방법을 쓸 경우 j for문은 많이 반복 될 수 있다.
        // 또한 최소 36번 이상 if 조건식을 실행하게 된다.
        
        
        for ( int i = 0; i < lottoNumbers.length; i++) {
            for (int j = 0; j < lottoNumbers.length; j++) {
                if (i != j && lottoNumbers[i] == lottoNumbers[j]) {
                    System.out.printf("%d 인덱스와 %d 인덱스가 중복이므로 %d에 새로운 값 할당\n" , i , j , i);
                    lottoNumbers[i] = random.nextInt(NUMBER_MAX) + 1;
                    j = -1; // 0이면 j++이 실행되면서 1이되어버림
                }
            }
        } 
        
        // 내가 알던거
        for ( int i = 0; i < lottoNumbers.length; i++) {
            for (int j = 1; j < i; j++) {
                if (lottoNumbers[i] == lottoNumbers[j]) {
                    System.out.printf("%d 인덱스와 %d 인덱스가 중복이므로 %d에 새로운 값 할당\n" , i , j , i);
                    lottoNumbers[i] = random.nextInt(NUMBER_MAX) + 1;
                    i--; 
                }
            }
        }
        
        
        // 2) 좀더 나은 방법
        //    우리가 랜덤 숫자를 하나 뽑아서
        //    그 숫자가 우리 배열에 존재하는지 체크하여
        //    존재하지 않을 때에만 배열에 넣어준다.
        
        // 어디 위치에 추가할 지 정하는 int idx
        int idx = 0;
        
        while ( idx < lottoNumbers.length ) {
            // 새로 추가 해줄 숫자
            // 랜덤 객체를 사용해서 1~45사이의 랜덤 숫자를 하나 뽑아서
            // randomNumber의 변수에 할당 한다.
            int randomNumber = random.nextInt(NUMBER_MAX) + 1;
            
            // randomNumber가 우리의 int배열인 lottoNumbers에 이미 존재하는 숫자 일때
            // 값이 false로 바뀔 boolean 변수 numberChecker
            // 중복된 숫자일 경우, false로 바뀌는 boolean 변수
            boolean numberChecker = true;
            
            // for문을 통해 lottoNumbers의 각 엘리먼트 randomNumber와 같은지 체크하고
            // 같을시에는 numberChecker의 값을 false로 바꾸고 break 한다.
            // 아래의 for문은 우리가 lottoNumbers의 i번째에 저장된 값과
            // randomNumber의 현재값과 비교해서
            // 두 값이 같을 경우, numberChecker의 값을 false로 바꾸고
            // 곧장 for문을 종료 시킨다.
            for ( int i = 0; i < lottoNumbers.length; i++) {
                if ( randomNumber == lottoNumbers[i]) {
                    numberChecker = false;
                    break; // for문도 종료시켜서 i가 끝까지가지 XX
                }
            }
            
            // numberChecker의 현재값이 true일 때에는
            // 아래의 if문이 실행되는데,
            // numberChecker가 true라는 것을 randomNumber의 현재갑소가
            // 일치하는 값이 lottoNumbers에 존재하지 않는다라는 의미이고
            // 따라서 randomNumber의 값은 중복되지 않는 값이라고 할 수 있다.
            
            if ( numberChecker ) {
                // 아래 코드는 lottoNumbers 배열 변수의 idx번 칸에
                // randomNumber의 현재값을 할당하겠다는 것.
                lottoNumbers[idx] = randomNumber;
                idx++;
            }
            
        }
        
        
        System.out.println();
        System.out.println("중복제거 후 ");
        System.out.println();
        
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("lottoNumbers[%d] : [%2d]\n", i, lottoNumbers[i]);
        }
    
    }

}
