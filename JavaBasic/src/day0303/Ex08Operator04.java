package day0303;

// 연산자 04

// 논리 연산자
//  - true/false 값을 가진 boolean 값의 연산에서 사용이 된다.
//  - &&, ||, !

public class Ex08Operator04 {
    public static void main(String[] args) {
        // 1. && 연산자 (AND 연산자)
        //  - AND 연산자는 왼쪽의 boolean 값과 오른쪽의 boolean값이 모두 true 일때에 만,
        //    결과값이 true가 나온다.
        System.out.println("1. && 연산자");
        System.out.println("true && true    :   " + (true && true));
        System.out.println("true && false   :   " + (true && false));
        // 노란줄 dead code의 이유 : 앞에 false가 나오면 뒤가 무엇이든 XX true일 수 없다.
        System.out.println("false && true   :   " + (false && true));
        System.out.println("false && false  :   " + (false && false));
        System.out.println("--------------------------");
    
        // 2. || 연산자 (OR 연산자)
        //  - OR 연산자는 왼쪽의 boolean 값과 오른쪽의 boolean값 중 한개라도 true이면
        //    결과값이 true가 나온다.
        System.out.println("2. || 연산자");
        // 노란줄 dead code의 이유 : 앞에 true이면 뒤에 나오면 뒤가 무엇이든 true기 때문.
        System.out.println("true  ||  true   :   " + (true || true));
        System.out.println("true  ||  false  :   " + (true || false));
        System.out.println("false ||  true   :   " + (false || true));
        System.out.println("false ||  false  :   " + (false || false));
        System.out.println("--------------------------");
        
        // 3. ! 연산자(NOT 연산자)
        //  - NOT 연산자는 true를 false로, false를 true로 바꾼 결과값을 제공한다.
        System.out.println("3. ! 연산자");
        System.out.println("!true   :   " + !true);
        System.out.println("!false  :   " + !false);
        System.out.println("--------------------------");

        // 그렇다면, 값이 특정 범위에 속하는지 알고 싶을때에는
        // 최소값 < 변수 < 최대값 으로 알 수 없다.(할 수 없다.)
        // 대신, 이렇게 범위를 검사할시에는 논리연산자를 사용해서
        // 변수가 특정 범위에 속하는지 확인 하려면
        // 최소값 < 변수 && 변수 < 최대값 처럼 
        // && 연산자를 사용하여 2개 모두 만족하는지 체크해야 한다.
        
        int number = -13;
        // 만약 number가 0 ~ 10 사이의 숫자인지 확인 하려면?
        System.out.println("number >= 0 && number <= 10 : " + (number >= 0 && number <= 10));
        System.out.println("--------------------------");
        
    }
    
}
