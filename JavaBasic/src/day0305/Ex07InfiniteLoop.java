package day0305;

// 무한 루프
//  - 조건식이 false가 나오지 않아
//    해당 프로그램을 강제종료 시키거나 사용자가 종료시킬 때까지
//    영원히 반복되는 반복문을 무한 루프라고 한다.

// 무한루프를 만드는데에는 여러가지 방법이 있지만
// 우리는 그중에서 while을 이용한 무한 루프를 만드는 세가지 방법을 알아보자.


public class Ex07InfiniteLoop {
    public static void main(String[] args) {
        
        // 1. 조건식의 변수가 변화가 없을 경우
        /*int number = 3;
        
        while ( number > 0 ) {
            System.out.println("무한루프 1번");
        }*/
        
        // 2. 조건식을 항상 참이 나오는 조건식을 사용한다.
        
//        while ( 1 > 0) {
//            System.out.println("무한루프 2번");
//        }
//        
        // 무한루프문의 뒤에 오는 코드는 전부 error이다
        int number = 4; 
    
        // 3. 조건식 X
        while(true) {
            System.out.println("무한루프 3번");
        }
        
        // 무한루프가 꼭 나쁜것은 x
        // 무한르푸를 사용해서 우리가 원하는 전체적인 틀을 만들어 줄 수도 있다.
        
    }
}
