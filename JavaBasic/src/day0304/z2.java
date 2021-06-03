package day0304;

/* IfEx22
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 *  1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 *      33   : 짝짝
 *      16   : 짝
 *       7   : 7
 *       
 *  if 1의 자리 경우 변수 < 10일 때
 *  3 % 3 == 0 일때 int check 1  1일때 짝
 *  else if 10의자리 경우 변수 > 10일 때 
 *  (안의 if 30번대 경우 변수 > 10 이면서 변수 < 40 일때
 *   일단 전부 cnt 1 1 일의 자리만 보면 되지 않나,,?) 잠깐나가
 *   안의 if 26 / 10 == 3 ||  == 6 || == 9 일때  check 1   
 *  33 여기 안의 if 33 % 10 == 3 || == 6 || ==  9  check++
 *  35
 *   *  23 % 10 의 몫이 3 || 6 || 9 일때 cnt 1 1일때 짝
 *  if check == 1 print 짝
 *  else if check == 2 print 짝짝    
 *  else print rNum    
 */

import java.util.Random;
public class z2 {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int rNum = random.nextInt(50) + 1;
        
        int check = 0;
        
        if ( rNum < 10 ) {
            if (rNum % 3 == 0 ) {
                check++;
            }
        } else {
            if ( rNum / 10 == 3 || rNum / 10 == 6 || rNum / 10 == 9 ) {
                check++;
            }
            if ( rNum % 10 == 3 || rNum % 10 == 6 || rNum % 10 == 9 ) {
                check++;
            }            
        }
        
        if ( check == 1 ) {
            System.out.println("짝");
        } else if ( check > 1 ) {
            System.out.println("짝짝");
        } else {
            System.out.println(rNum);
        }
        
        System.out.println("치트키 : " + rNum);
    }
}
