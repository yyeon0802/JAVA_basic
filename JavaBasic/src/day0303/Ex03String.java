package day0303;

// String
// String은 사실 java에서 기본적으로 제공해주는 클래스이다.
// 즉 우리가 String 타입의 변수를 만들게 되면
// 실제론 String클래스의 변수이므로 즉 String객체가 되는 것이다.

// String 객체의 특징은 한번에 여러개의 글자를 할당 가능하고
// 또 글자와 관련된 기능들( = 메소드 )이 다양하게 준비가 되어 있다는 것이다.

// String 값은 " " 안에 넣어주게 된다.

// 클래스의 구성요소에는 import가 없다.


public class Ex03String {
    public static void main(String[] args) {
        
        // 객체의 초기화 하는 방법
        //  - 클래스이름 변수이름 = new 클래스이름();
        
        // 단, 클래스이름() 은 생성자(Constructor)라는 특수한 메소드인데
        // 경우에 따라서 ()에 어떠한 값을 반드시 넣어주어야 할 때도 있다.
        
        // String변수 string을 선언하고 초기화 하자 
        String string = new String();
        
        // 만약 우리가 변수에 특정한 글자들을 넣어서 초기화 하고 싶다면 3가지가 가능하지만 2가지만 알아보자
        
        // 1. 생성자를 사용하는 방법
        //  - 생성자를 사용해서 String 변수에 값을 넣어줄 때에는 () 안에 넣고 싶은 값을 적어주면 된다.
        
        string = new String("abc");
        System.out.println(string);
        
        // 2. 값을 생성하여 넣는 방법
        //  - 이때는 변수 = "값"; 으로 넣어주면 된다.
        
        string = "def";
        System.out.println(string);
    
    }
}
