package day0303;

// 기본형 데이터타입 03

// 문자형 데이터타입
//  - 문자형 데이터타입은 char이라는 데이터타입인데, "차" 라고 읽지 않는다. 
//    character의 앞글자를 딴 것이라 "캐릭터" 이다.

// char는 ASCII 테이블이라는 문자표를 기반으로 만들어져서
// 숫자값과 그에 대응하는 문자가 정의 되어있다.
// 즉 우리가 어떠한 문자를 할당하면 그 문자에 대응되는 숫자값이
// 2진법의 형태로 변수에 저장되는 형태가 된다.
// 하지만, 캐릭터라는 데이터타입 자체는 잘 안 쓰이게 된다.
// -> char는 한번에 "1개의 문자만" 다룰 수 있기 때문

// char값은 우리가 '' 안에 한 글자를 넣어서 만들어주게 된다.

public class Ex02Char {
    public static void main(String[] args) {
        // char변수인 myChar를 선언하고 알파벳 B를 할당하자
        char myChar = 'B';
        
        // myChar의 현재값을 화면에 출력하자
        System.out.println(myChar);
        
        // char는 실제론 해당 공간에 2진법 값을 저장하기 때문에 다음과 같은 코드도 가능하다.
        
        // myChar에 99를 할당해보자
        myChar = 99;
        
        // myChar의 현재값을 출력하자 소문자 c
        System.out.println(myChar);
        
        // 하지만, char 변수는 한번에 한개의 값만 저장하기에 쓰임새가 매우 적다.
        // 여러개의 글자를 할당하고 관리하려면 ? 
        // -> String 데이터타입이 필요함.
    }
}
