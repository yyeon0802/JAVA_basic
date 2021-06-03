package util;

// 배열의 동적할당과 정적할당
// 기존에 우리가 미리 배열의 크기를 지정하고
// 배열을 초기화 하는 방식은 정적할당이라고 부르며
// 우리가 한번 정한 크기가 계속 유지가 되는 것을 뜻한다.

// 동적할당이란 우리가 무언가 새로운 것을 추가해주면 크기가 늘어나도
// 기존에 있던 것에서 삭제하면 크기가 줄어드는 배열을 동적 할당이라고 한다.

// 이 ArrayUtil 클래스는 동적할당을 위한 메소드들 뿐만이 아니라
// 우리가 배열을 사용할 때 도움이 되는 다양한 메소드들을 같이 구현할 것이다.

public class StringArrayUtil {
    // 1. 배열의 현재 크기를 알려주는 size() 메소드
    public static int size(int[] arr) {
        return arr.length;
    }
    
    public static int size(String[] arr) {
        return arr.length;
    }
    
    // 2. 파라미터로 배열과 int 값을 넘겨 받고, 해당 int값이 배열에 존재하면 true,
    //    존재하지 않으면 false 를 리턴하는 contains() 메소드
    public static boolean contains(int[] arr, int element) {
        
        for ( int i = 0; i < size(arr); i++) {
            if ( !(element == arr[i]) ) {
                return false;
            }
        }
        return true;
    }
    
    
    public static boolean contains(String[] arr, String element) {
        for (int i = 0; i < size(arr); i++) {
            if ( arr[i].equals(element) ) {
                return true;
            }
        }
        return false;
    }
    
    // 3. 파라미터로 배열과 int 값을 넘겨받고, 해당 int값이 가장 먼저 등장하는 index를 알려주는
    //     indexOf() 메소드.
    //     단, 해당 int값이 배열에 존재하지 않을 경우 , -1 return 된다.
    
    public static int indexOf(int[] arr, int element) {
        for (int i = 0; i < size(arr); i++) {
            if ( element == arr[i]) {
                return i; //여기서 종료시키니까 괜찮다
            }
        }
        
        return -1; // 밖에 있어도 여기까지 안 온다.
    }
    
    public static int indexOF(String[] arr, String element) {
        for (int i = 0; i < size(arr); i++) {
            if ( arr[i].equals(element) ) {
                return i;
            }
        }
        return -1;
    }
    
    // 4. 파라미터로 배열과 int 값을 넘겨받고, 해당 int 값이 가장 나중에 등장하는 index를 알려주는
    //    lastIndexOf() 메소드
    //    단, 해당 int값이 배열에 존재하지 않을 경우, -1이 return 된다/
    
    public static int lastIndexOf(int[] arr, int element) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if ( arr[i] == element ) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int lastIndexOf(String[] arr, String element) {
        
        for ( int i = size(arr) - 1; i >= 0; i--) {
            if (element.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
    
    // 5. 파라미터로 배열과 int 값을 넘겨 받고, 해당 배열의 크기를 1 늘려주고 
    //    그리고 가장 마지막 인덱스에 해당 int 값을 할당하고 **새로운 배열을 리턴해주는 
    //    add() 메소드
    public static int[] add (int[] arr, int element) {
           // 1. arr을 임시로 다른 배열에 저장한다.
            int[] temp = arr;
           // 2. 배열의 크기를 늘린다
            arr = new int[size(arr) + 1];
           // 3. for 문을 이용해서 임시 배열에 값들을 늘어난 arr에 차례대로 넣는다
            for ( int i = 0; i < size(temp); i++) {
                arr[i] = temp[i];
            }
           // 4. element를 제일 마지막에 넣는다.
            arr[size(arr) - 1] = element;

            // 5. arr을 리턴한다.
            return arr;
    }
    
    public static String[] add(String[] arr, String element) {
        
        String[] temp = arr;
        
        arr = new String[size(arr) + 1];
        
        for ( int i = 0; i < size(temp); i++) {
            arr[i] = temp[i];
        }
        
        arr[size(arr) - 1] = element;
        
        return arr;
    }
    
    // 6. 파라미터로 배열, 추가할 인덱스, 추가할 엘리먼트를 넘겨받고 해당 배열의 크기를 1 늘려주고
    //    지정된 인덱스에 새로운 엘리먼트를 할당하는 add() 메소드
    public static int[] add(int [] arr, int index, int element) {
        // 만약 index가 불가능한 index일 경우
        // arr을 그대로 리턴한다.
        if ( !(index >= 0 && index < size(arr)) ) {
            return arr;
        }
        
        // 1. 현재 배열을 temp에 복사
        int[] temp = arr;
        
        // 2. arr의 크기를 1 증가
        arr = new int[size(arr) + 1];
        
        // 3. 0~index-1까지의 값을 temp에서 arr에 복사한다
        for (int i = 0; i < index; i++) {
            arr[i] = temp[i];
        }
        // 4. arr[index]에 element를 할당한다.
        arr[index] = element;
        
        // 5. temp로 부터 복사하지 않은 것들을 복사해온다.
        for (int i = index + 1; i < size(arr); i++) {
            arr[i] = temp[i - 1];
        }
        
        // 6. 새로 만들어진 arr을 리턴한다.
        return arr;
    }
    
    // 7. 파라미터로 배열과 제거할 index를 받아서
    //     해당 인덱스를 제거하고
    //     크기도 1칸 줄어든 배열을 리턴하는 removeByIndex()메소드
    public static int[] removeByIndex(int[] arr, int index) {
        // 1. 만약 index가 유효하지 않은 index일 경우,
        //    arr을 그대로 리턴한다.
        if ( !(index >= 0 && index < size(arr)) ) {
            return arr;
        }
        
        // 2. 현재 배열의 내용을 임시로 int[] temp에 저장한다.
        int[] temp = arr;
        
        // 3.  arr을 크기가 1줄어든 배열로 선언
        arr = new int[size(arr) - 1];
        
        // 4.  temp 에서 0 ~ index - 1 까지 복사한다.
        for (int i = 0; i < index; i++) {
            arr[i] = temp[i];
        }
        
        // 5. temp에서 index ~ 끝까지 복사한다.
        for ( int i = index; i < size(arr); i++) {
            arr[i] = temp[i+1];
        }

        return arr;
    }
    
    // 8. 파라미터로 배열과 제거할 엘리먼트를 넘겨받아서
    //    그 엘리먼트와 일치하는 엘리먼트를 제거하는 removeByElement()
    
    public static int[] removeByElement(int[] arr, int element) {
        
        /*
        for ( int i = 0; i < size(arr); i++) {
            if ( !(element == arr[i]) ) {
                return arr;
            }
        }*/
        
        // 위의 7번 메소드가 구현해 놓은 removeByIndex()는,
        // 우리가 인덱스 값을 주면 해당 인덱스가 유효하면 알아서 제거해준다.
        // 그렇다면 앞서 3번에 만들어놓은 indexOf() 메소드를 사용하면
        // 파라미터로 넘어온 arr에서 element의 인덱스를 알 수 있다.
        // 만약 indexOf()가 arr에서 element가 존재하지 않아서 ,
        // -1을 리턴하면 --> removeByIndex가 알아서 처리 해준다 !
        // 따라서, 이 메소드는 removeByIndex를 실행한 결과값을 리턴하는데
        // 파라미터에 들어갈 인덱스는 indexOf() 메소드가 구해주는 형태가 된다.
        return removeByIndex(arr, indexOf(arr, element));

    }

}
