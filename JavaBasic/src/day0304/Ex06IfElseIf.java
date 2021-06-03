package day0304;

// if 조건문 03

// * if - else if 구조
//  - 만약 우리가 if 의 조건식이 false가 나올 경우
//    else 코드 블락을 무조건 실행시키는 것이 아니라
//    다른 조건식을 체크해야 할 경우에는 이렇게 if - else if 구조가 나오게 된다.

//  a. if - else if의 구조
//    -> if(조건식1) {
//          실행할 코드
//       } else if(조건식2) {
//          실행할 코드
//       } else if(조건식3) {
//          실행할 코드
//       } else if(조건식4) {
//          .....
//       } else {
//          실행할 코드
//       }

//     - 단, else 다음에는  else if 가 나올 수 없다.
//       else 는 위의 조건식이 false가 나왔을 경우 무조건
//       else가 실행되기 때문에, 그다음 else if는 접근이 아예 불가능 하다.

public class Ex06IfElseIf {
    public static void main(String[] args) {
        int number = 3;
        
        if (number == 1) {
            System.out.println("number는 1입니다.");
        } else if ( number == 2 ) {
            System.out.println("number는 2입니다.");
        } else if ( number == 3 ) {
            System.out.println("number는 3입니다.");
        } else if ( number == 4 ) {
            System.out.println("number는 4입니다.");
        } else {
            System.out.println("number는 그 외 입니다.");
        }
        
    }
}
