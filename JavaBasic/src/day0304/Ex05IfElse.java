package day0304;

// if 조건문 02

// * if - else 구조
//   - if 의 조건식이 false가 나오면
//     무조건 else 코드블락이 실행 되는 구조이다.

//   - if - else 구조에서는 무조건 둘중 하나의 코드블락만 실행이 된다.
//     만약, if 조건식이 true 가 나오면 if 코드블락만 실행이 되고
//     if 조건식이 false 가 나오면 else 코드블락만 실행이 된다.

public class Ex05IfElse {
    public static void main(String[] args) {
        int number = 12;
        
        if ( number == 2 ) {
            System.out.println("number 는 2 입니다.");
        } else {
            System.out.println("number 는 2가 아닙니다.");
        }
        
    }
}
