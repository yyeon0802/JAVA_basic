package day0304;

/* basic ifex23
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5   : 500원
 * 2) 6~10  : 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  ! 여기서부터는 일일이 지정이 아닌 계산식으로 필요함.
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */
 

import java.util.Scanner;
public class z1 {
    public static void main(String[] args) {
                        
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> 정거장 수 입력 : ");
        int station = scanner.nextInt();
        
        int fee = 600;
        int overFee = 50;
        
        // 이게 더 보기 쉽다,, 제발 순서대로 할것
        if ( station <= 5 ) {
            fee = 500;
        } else if ( station > 5 && station <= 10 ) {
            fee = 600;
        } else {
            if ( station % 2 == 1 ) {
                station++;
            }
            fee = fee + ( station - 10 ) / 2 * overFee;
        }
        
        System.out.printf(">> 총 요금 : %d원", fee);
        
        scanner.close();
    }
}
