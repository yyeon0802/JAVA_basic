package day0306;

// 1부터 100까지 소수를 구하는 프로그램

// 1. 소수란 무엇인가?
//      - 1과 자기 자신 외에는 약수가 없는 숫자 즉,
//         = 약수 갯수가 2개인 숫자 (즉, 1은 소수가 아니다!)

// 2. 약수란 무엇인가?
//      - A를 B로 나누어서 나눠 떨어지면 B는 A의 약수이다.
//         ex) 5를 1로 나누어서 나눠 떨어지면 1은 5의 약수이다.
//          = A를 B로 나누어서 나머지가 0이면 B는 A의 약수이다.

// 3. 어떤 숫자의 가장 큰 약수는?
//      - 자기 자신

// 우리는 3가지 조건만 활용해서 1부터 100까지 소수를 구하는 프로그램 작성하자.

public class Ex04PrimeNumber {
    public static void main(String[] args) {
        // 여기서 중첩 for 문을 만들어서 소수를 구하는데
        // i for문은 해당 숫자가 소수인지 아닌지를 검사할 숫자가 된다.
        // 그렇다면  iStart는 ? 1 / iEnd는 ? 100
        
        int iStart = 1;
        int iEnd = 100;
        
        for ( int i = iStart; i <= iEnd; i++ ) {
            // i의 약수가 몇개인지 저장할 int변수 count를 선언 및 초기화
            int count = 0;
            
            // j for문에 j는 i의 약수인지 아닌지를 검사할 숫자가 된다.
            // 그렇다면 jStart는? 1 / jEnd는? i
            
            int jStart = 1;
            int jEnd = i;
            
            for ( int j = jStart; j <= jEnd; j++) {
                if ( i % j == 0 ) {
                    count++;
                }
            }
            // count의 갯수가 2일때마다 
            // i가 소수입니다 라는 메세지를 출력해 준다.
            if ( count == 2 ) {
                System.out.printf("[%3d]는 소수입니다.\n" , i);
            }
        }
            
    }
}
