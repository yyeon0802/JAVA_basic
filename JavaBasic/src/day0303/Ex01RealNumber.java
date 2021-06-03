package day0303;

// 기본형 데이터타입 02

// 실수형 데이터타입
//  - float(32비트)
//  - double(64비트)가 있다.

// java에서는 실수에 대한 기본 데이터타입을 double로 지정해 놓음.
// so, 우리도 double을 사용하면 된다.


public class Ex01RealNumber {
    public static void main(String[] args) {
        // double변수 myDouble을 선언해보자
        double myDouble;
        
        // myDouble에 1.234를 할당해보자
        myDouble = 1.234;
        
        // myDouble의 현재값을 화면에 출력하자
        System.out.println(myDouble);
        
        // 정수 - 실수 타입 캐스팅을 직접 체험하자
        
        // 1. 정수형 값을 실수 공간에 할당하는 암시적 형변환
        // myDouble에 5를 할당해보자
        myDouble = 5;
        
        // myDouble에 현재값을 화면에 출력해보자
        System.out.println(myDouble);
        
        // 2. 실수형 값을 정수 공간에 할당하는 명시적 형변환
        
        // myDouble에 3.9를 할당해보자
        myDouble = 3.9; //int는 반올림X 그냥 버림
        
        // int변수 myInt 선언
        int myInt;
        
        // myInt에 myDouble의 현재값을 할당해보자
        // myInt = myDouble; 오류 들어가고 나니까 myDouble이 5.0되어 있어서,, 데이터손실!
        
        // myInt에 myDouble의 현재값을 형변환하여 할당
        myInt = (int)myDouble;
        
        // myInt의 현재값을 화면에 출력해보자
        System.out.println(myInt);
        
        // float변수(상수)에 값을 넣는 두가지 방법
        
        // 1. 코드에 적혀있는 실수를 명시적 형변환을 통해 float로 바꿔주는 방법
        // float변수 myFloat선언
        float myFloat;
        
        // myFloat에 3.4를 명시적 형변환을 통해 float로 바꾸어 할당하라
        myFloat = (float) 3.4;
        
        // myFloat의 현재값을 화면에 출력하라
        System.out.println(myFloat);
        
        // 2. 우리가 코드에 적은 실수가 double이 아니라 미리 float라고 말해주는 방법
        // float 타입을 가진 실수값을 만들려면
        // 실수값 뒤에 f를 붙여주면 된다.
        myFloat = 9.9f;
        
        // myFloat의 현재값을 화면에 출력하라
        System.out.println(myFloat);
        
    }
}
