package day0305;

// 조건문 02
// switch문

// if문은 우리가 true/false 가 나오는 조건식을 만들어서
// 해당 조건식이 true이면 실행, false이면 실행을 하지 않음 이라는 구조 였지만
// switch문은 우리가 값이 명확하게 나뉘는 값을 선택하여 (double float는 넣을 수 X)
// 그 값들에 대한 코드처리를 하게 된다.

// 하지만 switch는 우리가 가능한 값들에 대해 일일이 다 case로 정의해야 하기에,
// if문보다 상대적으로 잘 안쓰이게 된다.

// 6.99999999999 == 7? 실수형은 switch의 변수로 선택 할 수 XX

// switch 문의 기본구조
//  -> switch(변수) {
//       case 값 1 :
//          값 1일때 실행할 코드
//          break;
//       case 값 2 :
//          값 2일때 실행할 코드
//          break;
//       default  :
//          아무런 case에 해당하지 않을때 실행할 코드
//          break;
//    }

// break
//  - switch 혹은 반복문을 그 자리에서 종료시키는 키워드
//  ** switch의 경우, 해당 변수가 만족하는 케이스에 적혀 있는 코드부터 
//     break가 나올 때 까지의 모든 코드가 다 실행이 된다.

public class Ex03Switch01 {
    public static void main(String[] args) {

        int number = 2;

        switch (number) { // case 순서가 뒤죽박죽이어도 가능하다
        case 1:
            System.out.println("number는 1입니다.");
            break;
        case 2:
            System.out.println("number는 2입니다.");
            break;
        case 3:
            System.out.println("number는 3입니다.");
            break;
        case 4:
            System.out.println("number는 4입니다.");
            break;
        default:
            System.out.println("number는 그 외입니다.");
            break;
        }

        // switch의 변수에는 정수형, 문자형, String이 들어 갈 수 있다. boolean XXX

        byte b = 1;
        switch (b) {
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        default:
            System.out.println("디폴트");
            break;
        }

        char c = 'a'; // 실제로 정수로 취급됨...
        switch (c) {
        case 'a': // switch문에서 동일한 케이스가 있으면 error
            System.out.println("a 입니다.");
            break;
        case 'b':
            System.out.println("b 입니다.");
            break;
        case 'c':
            System.out.println("c 입니다.");
            break;
        /*
         * default : System.out.println("디폴트"); break;
         */

        }

        // 논리형 값은 switch의 제어변수로 들어갈 수 없다.

        // boolean bool = true;
        // switch(bool){
        //
        // }

        String str = new String("abc");
        switch(str) {
        case "abc" :
            System.out.println("abc입니다.");
            break;
        case "def" :
            System.out.println("def입니다.");
            break;
        case "abb" :
            System.out.println("abb입니다.");
            break;
        }
    }
}
