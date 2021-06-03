package day0303;

// 연산자
//  - 프로그래밍 언어에서 수학적 기호에 프로그래밍 기능을 정의해 놓았고
//    우리가 그 수학적 기호를 쓰게 되면 정의 되어있는 기능이 실행 되는 것이다.

// 예를 들어, 우리가 지금까지 값을 할당할 때 마다 썼던 " = " 은,
// 수학적 의미로는 왼-오 값이 같다는 의미이지만
// 프로그램에서는 값이 같다가 아닌, " 오른쪽 값을 왼쪽 공간에 할당하라 " 는 기능을 뜻한다.

// 연산자는 크게 다음과 같이 분류된다.
//  1. 산술연산자    :   간단한 사칙연산 + 나머지 연산
//  2. 할당연산자    :   변수 혹은 상수등의 공간에 값을 할당하는 다양한 연산자
//  3. 비교연산자    :   두개의 값을 비교하는 연산자
//  4. 논리연산자    :   true 혹은 false 값을 갖는 boolean값들에 대한 연산자
//  5. 비트연산자    :   2진법 숫자에 대한 연산자

// 하지만 이중에서 비트연산자는 주로 속도가 중요한 네트워크 혹은 이미지 처리 등에서 주로 사용이 되고
// 난이도가 매우 높음(과정에서 패스)

// 단, 연산자가 2개 이상의 기호로 이루어져 있더라도
// 가운데에 띄어쓰기를 하면 안된다.
// 반드시 붙여서 써야한다. ex) += -=

// 1. 산술연산자
//  - 간단한 사칙연산 + 나머지 연산 5가지로 이루어져 있는 연산자.
//  - 2개의 값을 더하고, 빼고, 곱하고, 나누고, 나머지를 결과값을으로 구해준다.
//  - 연산자의 결과값을 어디 변수에 저장해 줄 수도 있지만, 그냥 그 자리에서만 쓸 수도 있다.
//  - 변수의 값을 실제로 변경하는 할당연산자를 제외한 나머지 연산자들은 변수에 저장되어있는 실제 값을 변경시키지는 않는다.
//    주로, 연산자의 결과값을 다시 공간에 할당하는 방식으로 값이 바뀌게 되는 것이다.

//  - 산술연산자의 경우 다음과 같은 특징을 가진다.
//      1) 똑같은 데이터타입끼리 산술 연산할 경우에는 결과값은 해당 데이터타입이 된다.
//      2) 크기가 다르지만 카테고리가 같은(ex. byte와 int / double과 float)등을 산술연산하면
//         결과값은 더 큰 데이터타입이 된다.
//      3) 정수와 실수를 산술 연산하면 결과값은 실수가 된다.

// 2. 할당연산자

public class Ex05Operator01 {
    public static void main(String[] args) {
        // int변수 number1과 number2를 만들고 각각 6과 11을 할당하자
        int number1 = 6;
        int number2 = 11;
        // int number1 = 6, number2 = 11; 되긴하나 권장하지 XX 
        
        // 각각을 산술연산하여 화면에 출력해 보자
        
        // +는 왼쪽의 현재값에 오른쪽의 현재값을 더한 결과값을 구한다.
        System.out.println(number1 + number2);
        
        // -는 왼쪽의 현재값에 오른쪽의 현재값을 뺀 결과값을 구한다.
        System.out.println(number1 - number2);
        
        // *는 왼쪽의 현재값에 오른쪽의 현재값을 곱한 결과값을 구한다.
        System.out.println(number1 * number2);
        
        // %는 왼쪽의 현재값에 오른쪽의 현재값을 나눈 몫을 구한다.
        System.out.println(number1 / number2);
        
        // %는 왼쪽의 현재값에 오른쪽의 현재값을 나눈 나머지를 구한다.
        System.out.println(number1 % number2);

        System.out.println("=======================");
    
        // double변수 myDouble1 myDouble2를 만들어 6.0과 11.0을 할당하자
        double myDouble1 = 6.0;
        double myDouble2 = 11.0;
        
        System.out.println(myDouble1 + myDouble2);
        System.out.println(myDouble1 - myDouble2);
        System.out.println(myDouble1 * myDouble2);
        System.out.println(myDouble1 / myDouble2);
        System.out.println(myDouble1 % myDouble2);
    
        System.out.println("=======================");
        
        //number1과 myDouble2를 산술연산해보자 더큰 형태인 정수로 나온다
        System.out.println(number1 + myDouble2);
        System.out.println(number1 - myDouble2);
        System.out.println(number1 * myDouble2);
        System.out.println(number1 / myDouble2);
        System.out.println(number1 % myDouble2);
        
        System.out.println("=======================");

        // 번외. String에 대한 + 연산 
        //  - java는 String에 대한 + 연산을 지원하고 있다.
        //  - String에 + 연산을 하면 앞의 값과 뒤의 값을 이어붙여서 
        //    하나의 커다란 String으로 만들겠다는 의미가 된다.
    
        //  1. String + String 의 경우
        String str1 = new String();
        str1 = "abc" + "def";
        System.out.println(str1);
    
        //  2. String + 다른 데이터타입의 경우
        //    - 이때는 다른 데이터타입을 String의 형태로 "바꾸고"
        //      앞의 String 뒤에 이어 붙인다.
        str1 = "abc" + 123;
        System.out.println(str1);
        
        //  3. 다른 데이터타입 + String의 경우
        //    - 이때는 다른 데이터타입을 String의 형태로 "바꾸고"
        //      뒤의 String 값을 앞에 만들어진 String 뒤에 이어붙인다.
        str1 = 10 + "100";
        System.out.println(str1);
        
    }
}
