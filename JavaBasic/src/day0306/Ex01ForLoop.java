package day0306;

// 반복문 02
// for 반복문
//  - 조건이 만족되면 횟수에 상관 없이 계속 돌아가던 while 반복문과 다르게
//    비교적 횟수와 관계가 있는 반복문 이다.

// while 반복문은 끝이 어딘지 모르는 무언가를 계속 읽어오거나 적을 때 주로 사용이 되지만,
// for 반복문은 끝이 명확하거나 순서가 있는 무언가를 다룰 때 주로 사용이 된다.

// for 반복문은 주로 다음과 같은 형태를 가진다.
// for(제어변수 선언과 초기화; 반복 조건식; 제어변수 변화 할당식){
//      반복할 코드
//  }

public class Ex01ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("i의 현재값 : " + i);
        }
        // 위의 for문의 실행순서를 하나하나 짚고 넘어가보자
        // 1. int i = 1; 실행
        // 2. i <= 3; i의 현재값이 1 이므로 true
        // 3. System.out.println("i의 현재값 : " + i);
        // 4. i++; i의 현재값 : 2
        // 5. i <= 3; i의 현재값이 2 이므로 true;
        // 6. System.out.println("i의 현재값 : " + i);
        // 7. i++; i의 현재값 : 3;
        // 8. i <= 3; i의 현재값이 3이므로 true;
        // 9. System.out.println("i의 현재값 : " + i);
        // 10. i++; i의 현재값 4
        // 11. i <= 3; i의 현재값이 4이므로 false
        // 12. for문 종료
        
        // for문에 대한 여러가지 팁과 주의 할 점
        // 1. 제어변수의 이름은 여러분 마음대로 해줄 수 있지만,
        //     전통적으로 중첩순서에 따라 i -> j -> k 순으로 들어간다.
        
        // 2. 제어변수의 초기화나 반복 조건식에 다른 변수를 사용할 수 도 있다.
        System.out.println();
        System.out.println("2. 제어변수의 초기화나 반복 조건식에 다른 변수를 사용할 수 도 있다.");;
        int start   = 1;
        int end     = 4;
        
        for ( int i = start; i <= end; i++) {
            System.out.println("i의 현재값 : " + i);
        }
        
        // 3. 우리가 지금은 i++을 주로 사용하지만,
        //     i의 현재값을 변화시킬 수 있는 할당 연산자면 뭐든 사용 가능하다.
        
        System.out.println();
        System.out.println("3. i++이 아닌 할당 연산자를 사용할 수도 있다.");        
        for ( int i = start; i <= end; i +=2 ) {
            System.out.println("i의 현재값 : " + i);
        }
        
        // 4. 여러분들이 초기단계에서 가장 많이 하는 실수는,
        //     i자리에 1을 넣는 실수를 많이 한다.
        //     이러면 무한루프가 되거나 아예 for문이 시작안 할 수도 있으니 주의해야 한다
        
        // 5. i도 하나의 변수이다. 즉 유효범위가 for문 내부인 변수가 되니까
        //     즉, 중복 선언을 조심해야 한다.
        
        // 6. 다른 제어문들도 마찬가지이지만, for문도 바로 뒤에 ;을 붙이면
        //    반복할 코드 블락이 아예 분리가 되어 의미가 바뀌게 되니,
        //     ()뒤에 ;을 붙이는 것을 주의하자.
    }
}
