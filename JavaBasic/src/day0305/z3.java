package day0305;

public class z3 {
    public static void main(String[] args) {
        
        int num = 1;
        while ( true ) {
            num++;
            if ( num % 9 == 0 ) {
                if ( num / 10 == 6 ) {
                    System.out.println(num);
                    break;
                }
            }
        }
        // 마지막수,,, 다 돌고 마지막,,, for로 while(최대값사용해서) 로는 안되나?
        num = 0;
        int maxNum = 0;
        while ( true ) {
            num++;
            if ( num % 8 == 5 ) {
                if ( maxNum < num ) {
                    maxNum = num;
                }
            }
            if ( num == 150 ) {
                System.out.println(maxNum);
                break;                
            }
        }
        
         // 아 거꾸로하라고...
        
        int under150 = 0;
        num = 0;
        while ( num < 150) {
            if ( num % 8 == 5 ) {
                if ( under150 < num ) {
                    under150 = num;
                }
            }
            num++;
        }
        System.out.println(under150);
        // for는 ?
        
        for ( int i = 150; i > 0; i-- ) {
            if ( i % 8 == 5 ) {
                System.out.println(i);
                break;
            }
        }
       
        num = 50;
        int cnt = 0;
        while ( true ) {
            num++;
            if ( num % 9 == 0 ) {
                cnt++;
            }
            
            if ( num == 100 ) {
                System.out.println(cnt + "개");
                break;
            }
        }
        
        num = 28;
        maxNum = 0;
        while ( true ) {
            num++;
            if ( num % 28 == 0 ) {
                if ( maxNum < num ) {
                    maxNum = num;
                }
            }
            
            if ( num == 999 ) {
                System.out.println(maxNum);
                break;
            }
        }
        
        
        
    }
}
