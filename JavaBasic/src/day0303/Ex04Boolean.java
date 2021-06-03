package day0303;

// 기본형 데이터타입03
// 논리형

// 논리형 데이터타입에는 boolean 이라는 데이터타입 1개만 존재한다.
//  - boolean에는 단 두 가지 값만 존재함
//      1)true
//      2)false

// boolean의 경우 우리가 특별히 변수를 만들어 쓰기보다는
// 나중에 배우게 될 연산자 혹은 메소드의 결과물을 받아서 쓰는 경우가 대부분이다.

public class Ex04Boolean {
    public static void main(String[] args) {
        // boolean변수 myBoolean을 만들고 거기에 true 할당해보자
        boolean myBoolean = true; // 보라색! 자바에서 의미를 부여한 키워드 
        
        // myBoolean의 현재값 출력하자
        System.out.println(myBoolean);
        
        // myBoolean에 false값 할당하자
        myBoolean = false;
        
        // myBoolean의 현재값 출력하자
        System.out.println(myBoolean);
    }
}
