package day0303;

// 연산자 02

// 할당 연산자
//  - 기본적으로 오른쪽의 값을 연산하고 그 결과값을 왼쪽 공간에 할당 한다는 모양새를 가진다. 

public class Ex06Operator02 {
    public static void main(String[] args) {
        
        int number;
        
        // 1. =
        //      오른쪽 값을 왼쪽 공간에 그대로 할당하라
        
        number = 5;
        System.out.println(" = 이후의 number의 현재값 : " + number);
    
        // 2. +=
        //      왼쪽 공간의 현재값에 오른쪽 값을 더하고 그 결과값을 다시 왼쪽 공간에 할당하라
        //      이때는 String의 현재 저장된 문자들 뒤에 오른쪽 값을 이어붙인 결과값을
        //      다시 String 공간에 넣어라 라는 의미가 된다.
        //      += 연산자는 String에도 사용이 가능하다.
        
        number += 10;        

        System.out.println(" += 이후의 number의 현재값 : " + number);
    
        // 3. -=
        //      왼쪽 공간의 현재값에 오른쪽 값을 빼고 그 결과값을 다시 왼쪽 공간에 할당하라
        
        number -= 3;
        System.out.println(" -= 이후의 number의 현재값 : " + number);
    
        // 4. *=
        //      왼쪽 공간의 현재값에 오른쪽 값을 곱하고 그 결과값을 다시 왼쪽 공간에 할당하라
        
        number *= 4;
        System.out.println(" *= 이후의 number의 현재값 : " + number);
        
        // 5. /=
        //      왼쪽 공간의 현재값에 오른쪽 값을 나누고 그 몫을 다시 왼쪽 공간에 할당하라
        
        number /= 7;
        System.out.println(" /= 이후의 number의 현재값 : " + number);
        
        // 6. %=
        //      왼쪽 공간의 현재값에 오른쪽 값을 나누고 그 나머지를 다시 왼쪽 공간에 할당하라
        
        number %= 4;
        System.out.println(" %= 이후의 number의 현재값 : " + number);
        
        System.out.println("==============================");
        
        // 증감 연산자
        //  - 증감 연산자는 해당 공간의 값을 정확히 1씩 변화를 시킨다.
        //  - 하지만 증감 연산자가 특별한 이유는 
        //    변수의 앞에 붙냐 뒤에 붙냐에 따라서 의미가 달라지기 때문.
        
        // 증감 연산자(++, --)가 앞에 붙을 경우
        //  - 그 줄에서 실행 우선순위가 가장 위로 올라간다. 즉, 가장 먼저 실행 된다.

        // 증감 연산자(++, --)가 뒤에 붙을 경우
        //  - 그 줄에서 실행 우선순위가 가장 아래로 내려간다. 즉, 가장 나중에 실행 된다.

        // 증감 연산자가 앞에 붙을 때는 특별히 전위 증감 연산자라고 하고
        // 증감 연산자가 뒤에 붙을 때는 특별히 후위 증감 연산자라고 한다.
        
        // 전위 증감 연산자
        System.out.println(" number의 현재값 : " + number);
        System.out.println(" ++number      : " + ++number);
        // 위의 System.out.println(" ++number      : " + ++number);은 비록 한줄이지만
        // 실제론 다음과 같은 단계를 거친다.
        //  1) ++number가 가장 먼저 실행이 되서, number의 현재 값이 2에서 3으로 증가된다.(제일 먼저 바뀜)
        //  2) "++number : " + number가 실행이 된다.
        //      이때는 number의 현재값 3이 int 형태지만 String으로 변환되서
        //      "++number : " 뒤에 붙어서 결과적으론
        //      "++number : 3" 이라는 String값이 만들어진다.
        //  3) 2)의 단계에서 만들어진 "++number : 3" 이라는 String 값을
        //     System.out.println()이 화면에 출력한다.
        
        System.out.println(" number의 현재값 : " + number);
        
        System.out.println("==============================");
      
        // 후위 증감 연산자
        System.out.println(" number의 현재값 : " + number);
        // 실제론 다음과 같은 단계를 거친다.
        //  1) "number++ : " + number가 실행되서
        //      number의 현재값인 int 값 3이 String 값 "3"으로 변환되서
        //      "number++ : " 뒤에 이어진다.
        //      결과적으로 "number++ : 3" 이라는 String값이 만들어진다.
        //  2) 1)단계에서 만들어진 "number++ : 3"이라는 String값을 
        //     System.out.println()이 화면에 출력한다.
        //  3) number++가 실행이 되서 number의 현재값이 3에서 4로 1 증가 된다.
        
        System.out.println(" number++      : " + number++);
        System.out.println(" number의 현재값 : " + number);
        
    }
}
