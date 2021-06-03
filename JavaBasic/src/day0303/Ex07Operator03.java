package day0303;

// 연산자 03

// 비교 연산자
//  - 우리가 사용한 연산자가 맞는지, 틀린지를 판정해 준다.
//    즉, 비교 연산자의 결과값은 true 혹은 false 값을 갖는 boolean형이 된다.
//  - <, <=, >, >=, ==, !=


public class Ex07Operator03 {
    public static void main(String[] args) {
        
        // 3이 할당된 int변수 number를 선언과 초기화
        int number = 3;
        
        // 1. < 은 왼쪽 값이 오른쪽 값보다 작으면 true, 크거나 같으면 false 가 나온다.
        System.out.println(" 1. < ");
        System.out.println(" number < 10 : " + (number < 10));
        System.out.println(" number < 0  : " + (number < 0));
        System.out.println(" number < 3  : " + (number < 3));
        System.out.println("------------------------");
        
        // 2. <= 은 왼쪽 값이 오른쪽값보다 작거나 같으면 true, 크면 false가 나온다.
        System.out.println(" 2. <= ");
        System.out.println(" number <= 10 : " + (number <= 10));
        System.out.println(" number <= 0  : " + (number <= 0));
        System.out.println(" number <= 3  : " + (number <= 3));
        System.out.println("------------------------");
        
        // 3. > 은 왼쪽 값이 오른쪽 값보다 크면 true, 작거나 같으면 false가 나온다.
        System.out.println(" 3. > ");
        System.out.println(" number > 10 : " + (number > 10));
        System.out.println(" number > 0  : " + (number > 0));
        System.out.println(" number > 3  : " + (number > 3));
        System.out.println("------------------------");

        // 4. >= 은 왼쪽 값이 오른쪽 값보다 크거나 같으면 true, 작으면 false가 나온다.
        System.out.println(" 4. >= ");
        System.out.println(" number >= 10 : " + (number >= 10));
        System.out.println(" number >= 0  : " + (number >= 0));
        System.out.println(" number >= 3  : " + (number >= 3));
        System.out.println("------------------------");
        
        // 5. == 은 왼쪽 값이 오른쪽 값과 같으면 true, 다르면 false가 나온다.
        System.out.println(" 5. == ");
        System.out.println(" number == 3  : " + (number == 3));
        System.out.println(" number == 5  : " + (number == 5));
        System.out.println("------------------------");

        // 6. != 은 왼쪽 값이 오른쪽 값과 다르면 true, 같으면 false가 나온다.
        System.out.println(" 6. != ");
        System.out.println(" number != 3  : " + (number == 3));
        System.out.println(" number != 5  : " + (number == 5));
        System.out.println("------------------------");
        
        
        // 비교 연산자를 사용할때 주의할 점
        
        //  1) 어떤 값이 특정 범위에 속하는지 알고 싶을 때에는
        //     최소값 < 알고 싶은 값 < 최대값 으로하면 에러가 발생한다.
        //     컴퓨터의 진행은 동시에 하지 X 왼 -> 오 / 위 -> 아래 순으로 읽는다.
        // System.out.println(0 < number < 10);
        // -> 위 코드에서 사람이면 0 < number 와 number < 10을 비교하여 true로 생각하지만,
        //    컴퓨터는 0 < number를 먼저 실행하여 결과값을 받는다. 
        //    그 결과값은 true/false 값을 가진 boolean 이다.
        //    그리고 나서 true / false가 10보다 작은지 체크하려고 하면, 이해할 수 없는 코드가 되기에 에러 발생.
        //    따라서, 우리가 값이 범위에 속하는지 체크하려면, 다음에 배울 논리 연산자를 사용해야 한다.
        
        //  2) 변수와 변수가 아닌 값 자체를 비교할 때에는
        //     변수를 왼쪽에 두는 것이 좀 더 가독성이 좋다.
        
        //  3) 참조형 변수의 값을 비교할 때에 비교 연산자를 사용하게 된다면,
        //     부정확한 결과값을 얻을 가능성이 매우 높다. (중요)
        //  -> 참조형변수가 필요하니 String객체 3개 생성하자 **그림판설명
        String str1 = new String("가나다라");  
        String str2 = "가나다라"; // 기존 str2이 가진 힙주소에 다른 힙주소의 가나다라값을 덮어씌움
        String str3 = str2;
        
        // str1, str2, str3의 현재 값을 각각 출력해 보자
        System.out.println(" str1의 현재값  :   [" + str1 + "]");
        System.out.println(" str2의 현재값  :   [" + str2 + "]");
        System.out.println(" str3의 현재값  :   [" + str3 + "]");
        System.out.println("----------------------------");
        
        // 그럼 str1과 str2, str1과 str3, str2와 str3을 비교 연산자를 사용하여 비교해보자
        System.out.println(" str1 == str2   :   " + (str1 == str2));
        System.out.println(" str1 == str3   :   " + (str1 == str3));
        System.out.println(" str2 == str3   :   " + (str2 == str3));
        System.out.println("----------------------------");
        // 연산자는 힙의 주소를 찾아갈 수 XX 주소값 자체만 비교한다 **그림판
        
        // 참조형 변수는 stack 메모리 영역에는 
        // -> 해당 변수의 실제 값 그리고 
        //    추가적인 정보가 들어있는 heap 영역 공간을 향하는 메모리 주소값을 가지게 된다.
        
        //  so, 위의 우리가 String객체에 "가나다라"라는 4개의 글자를 넣고
        //  그래서 우리가 String객체를 비교하겠다 라고 하는건, 그 글자들이 일치하는지 비교하겠다 라는 의미가 된다.     
        //  하지만, 우리가 저장되어 있는 문자들이 일치하는지 비교하기 위해
        //  비교 연산자 == 을 사용하게 되면 문제가 생긴다.
        //  비교 연산자는 참조형이라는 데이터타입이 나오기 전부터 존재하던 개념이기에
        //  참조형 변수에 저장되어 있는 주소값을 따라가서 heap 영역의 해당 공간을 찾아 들어가
        //  실제 값이 무엇인지 비교하는 기능이 없다.
        
        //  대신 비교 연산자는 stack 영역에 저장되어 있는 값을 기준으로 해서 비교를 실행하게 된다.
        //  그렇기 때문에, 위의 비교 연산자를 통한 str1과 str2, str1과 str3, str2와 str3 비교를 실행하면
        //  주소값이 일치하는 str2와 str3를 제외하고 모두 == 연산자의 결과가 false가 나오는 것이다.
    
        //  하지만, 우리가 정말로 비교하고 싶은 것은 주소값이 아니라
        //  해당 객체의 실체 값을 비교하여 모든 글자가 같으면 true,
        //  만약 한 글자라도 다르면 false를 확인하고 싶은 것.
        
        //  따라서, 우리가 객체의 실제값 비교를 위해서는
        //  비교 연산자가 아닌, 객체의 equals() 메소드를 통한 비교를 해야한다.
        
        //  객체의 equals() 메소드를 실행 할 때에의 형식은 다음과 같다.
        //      - 객체.equals(비교대상);
        System.out.println("str1.equals(str2)   :   " + str1.equals(str2));
        System.out.println("str1.equals(str3)   :   " + str1.equals(str3));
        System.out.println("str2.equals(str3)   :   " + str2.equals(str3));
    }
}
