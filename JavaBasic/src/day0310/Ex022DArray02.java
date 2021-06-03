package day0310;
// 구구단을 int 2차원 배열에 값을 넣고
// 출력하시오
public class Ex022DArray02 {
    static final int MIN_SIZE = 1;
    static final int MAX_SIZE = 9;
    public static void main(String[] args) {
        
        // 구구단은 2단~9단까지
        // 8개의 배열이 모여있는 2차원 배열이다
        // 각 배열은 1~9까지 곱한 수가 저장되는 9칸짜리 배열.
        
        
        int[][] gugu = new int[MAX_SIZE - 1][MAX_SIZE];
        
        /*
        for ( int i = MIN_SIZE + 1; i <= MAX_SIZE; i++) {
            System.out.println("===[" + i + "] 단 ===");
            for (int j = MIN_SIZE; j <= MAX_SIZE; j++) {
                System.out.println( i + "x" + j + "=" + (i*j));
            }
        }*/
        
        /*
        for ( int i = MIN_SIZE + 1; i <= MAX_SIZE; i++) {
            System.out.println("===[" + i + "] 단 ===");
            for (int j = MIN_SIZE; j <= MAX_SIZE; j++) {
                gugu[i][j] = i*j;
                System.out.println(i +"x" + j+ "=" + gugu[i][j]);
            }
        }*/
        
        // 범위조심하자!!!
        // 구구단은 int배열이 8개 모여있는 배열이므로
        // 크기가 8인 것이다 !
        // for문 인덱스 조심 맘대로 줄여버리지 말아라,,
        
        for ( int i = 0; i < gugu.length; i++) {
            // 구구단 = 배열이 모여 있는 배열
            // 구구단의 i번째 엘리먼트 = 배열 엘리먼트가 배열!
            
            // 그럼 gugu[i].length하면 i번째 엘리먼트인 배열의 크기가 나온다~
            for (int j = 0; j < gugu[i].length; j++) {
                
                // gugu[i][j]라고 하면
                // gugu의 i번째 배열의 j번째 칸을 가리키게 된다.
                gugu[i][j] = (i + 2) * (j + 1);
              //  System.out.println((i + 2) + "x" + (j + 1) + "=" + gugu[i][j]);
            }
        }
        
        
         for ( int i = 0; i < gugu.length; i++) {
             System.out.println("===[" + (i+2) + "] 단 ===");
             for(int j = 0; j < gugu[i].length; j++) {
                 System.out.printf(" %d * %d = %2d \n", i + 2 , j + 1 , gugu[i][j]);
             }
         }
        
    }
}
