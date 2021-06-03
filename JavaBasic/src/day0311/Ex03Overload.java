package day0311;
// 똑같은 이름의 변수는 만들어 줄 수 없다.
// 하지만 똑같은 이름의 메소드는 만들어 줄 수 있다.
// 단, 이때는 한가지 조건이 붙는데
// 똑같은 이름의 메소드를 적어줄 때에는
// 메소드의 파라미터가 달라야 한다는 뜻이다.
// 파라미터가 다르다라는 의미는
// 파라미터의 데이터타입이 선언된 순서가 다르다 라는 뜻이다.

// 이렇게 파라미터를 다르게 해서 똑같은 이름의 메소드를 여러개 만들 수 있게 하는 ㄱ ㅓㅅ을
// 우리가 오버로딩(overloading)이라고 부른다.
// 오버로딩의 목적은 **같은 목표를 가지고 있는 메소드의 경우, 똑같은 이름으로 묶어서 
// 우리가 코드의 가독성을 높여주기 위함이다.

// 대표적으로 오버로딩이 되어있는 메소드가 바로
// print(), println()이다.

public class Ex03Overload {
    public static void main(String[] args) {
        System.out.println(plus(3 , 4));
        System.out.println(plus(3.0 , 4.0));
    }
    
    //int, int에 대한 plus method
    public static int plus(int number1 , int number2) {
        System.out.println("int + int");
        return number1 + number2; 
    }
    // 아래 코드는 에러가 발생
//    public static int plus(int number1 , int number2) {
//        return number1 + number2;
//    }
    
    
    // double , double 에 대한 plus method
    public static double plus(double number1 , double number2) {
        System.out.println("double + double");
        return number1 + number2;
    }
    
    
    
}
