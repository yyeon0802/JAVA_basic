package day0305;
// 제어문 02

// 반복문(Loop)
//  - 특정 조건식을 체크해서 그 조건식이 true가 나오는 "동안"
//    코드블락을 실행 시키는 것을 반복문 이라 말한다.

//  크게 1)for 반복문 2)while 반복문 2가지가 있는데 의미가 서로 좀 다르다.

// 1) for 반복문   :   비교적 명확한 횟수를 반복함
// 2) while 반복문 :   특정 조건을 만족하는 동안 계속 반복됨

// while 반복문의 기본 형태
//  -> while(조건식) {
//        조건식이 참일때 실행할 코드
//    }

public class Ex05While01 {
    public static void main(String[] args) {
        int number = 10;
        
        while( number <= 3 ) {
            System.out.println("while 코드블락 첫번째 줄 도착");
            System.out.println("number의 현재값 : " + number);
            number++;
            System.out.println("while 코드블락 마지막 줄 도착");
        }
        System.out.println("프로그램 종료");
    }
}
