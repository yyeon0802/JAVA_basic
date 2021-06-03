package day0312;

// call my value vs call by reference
// 우리가 메소드에 파라미터로 기본형 변수와 참조형 변수를 넣으면 ?

// 자바에서는 파라미터로 기본형 변수 혹은 기본형 값이 넘어갈 때와, 참조형 변수 혹은 참조형 값이 넘어갈 때 차이가 존재한다.
// 기본형 데이터타입이 파라미터로 넘어갈 경우 "값에 의한 호출(Call by Value)" 가 일어나고
// 실제 변수가 파라미터로 들어가는 것이 아니라 변수의 저장된 값이 복사 되서 넘어간다.

// 참조형 데이터 타입이 파라미터로 넘어갈 경우 "참조에 의한 호출(Call by Reference)" 이 일어나고
// 해당 참조형 데이터타입의 주소값이 넘어가기 때문에 원본이 넘어간다고 볼수 있다.

// 즉 Call by Value -> 원본값이 변경 되지 않는다 xx!
//    Call by Reference -> 원본의 값이 변경 된다 oo!

public class Ex02Method02 {
    public static void main(String[] args) {

        int a = 3;
        int[] arr = new int[3];
        
        System.out.println(a);
        System.out.println(arr[0]);

        increase(a);
        increase(arr);
        
//        이게 되려면
//        a = increase(a);
        
        System.out.println(a); // a를 출력하면 앞에 원본 int a = 3이 출력되겠지
        System.out.println(arr[0]);
    }
    
    // 실제 변수는 stack 안의 들어있는 실제 값을 복사해줘 줘버림
    public static void increase(int number) { // int number에 변수a가 아니고 값인 3만 복사해서 넘어간다 
        number += 3;
    }
    
    /* 이게 되려면
    public static int increase(int number) { // int number에 변수a가 아니고 값인 3만 복사해서 넘어간다 
        return number += 3;
    }
    */
    
    // stack영역의 주소값을 줘버림
    public static void increase(int[] arr) {
        arr[0] = 100;
    }
}
