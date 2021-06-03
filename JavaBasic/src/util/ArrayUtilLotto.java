package util;

// 배열의 동적할당과 정적할당
// 기존에 우리가 미리 배열의 크기를 지정하고
// 배열을 초기화 하는 방식은 정적할당이라고 부르며
// 우리가 한번 정한 크기가 계속 유지가 되는 것을 뜻한다.

// 동적할당이란 우리가 무언가 새로운 것을 추가해주면 크기가 늘어나도
// 기존에 있던 것에서 삭제하면 크기가 줄어드는 배열을 동적 할당이라고 한다.

// 이 ArrayUtil 클래스는 동적할당을 위한 메소드들 뿐만이 아니라
// 우리가 배열을 사용할 때 도움이 되는 다양한 메소드들을 같이 구현할 것이다.

public class ArrayUtilLotto {
    public static int size2d (int[][] arr){
        return arr.length;
    }
    
    public static int[][] add(int[][]arr, int playSet, int numberCount, int userNumber){
        
        int[][] temp = arr;
        
        arr = new int [playSet][numberCount];
        
        for ( int i = 0; i < size2d(temp); i++) {
            for ( int j = 0; j < temp[i].length; j++) {
                arr[i][j] = temp[i][j];
            }
        }
        arr[playSet][numberCount] = userNumber;
        
        return arr;
    }
    
}
