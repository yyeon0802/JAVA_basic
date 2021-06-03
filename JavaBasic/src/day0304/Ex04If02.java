package day0304;
// 1. 사용자로 부터 숫자를 입력받아 자연수면 자연수입니다 출력되게 하시오
// 2. 사용자로부터 나이를 입력받아서 미성년자이면 미성년자입니다 가 출력되게 하시오
// 3. 사용자로부터 숫자를 입력받아서 홀수이면 홀수 입니다가 출력되게 하시오
// 4. 사용자로부터 아이디와 비밀번호를 입력받아서, 아이디가 admin,  비밀번호가 111 이면 로그인 성공 출력
// 5. 사용자로부터 숫자를 입력받아서 0이상 100미만 일 경우 "두자리 이하 자연수입니다"가 출력되게 하시오

import java.util.Scanner;
public class Ex04If02 {
    
    // 문5)의 변하지 않을 로그인 아이디 패스워드 고정
    
    //static final int adultAge = 19;
    //static final String id = new String("admin");
    //static final String pw = new String("111"); // ""라서 String
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("문1)");
        
        // 받을 숫자의 변수 선언 및 사용자로 부터 숫자 입력받기
        System.out.print(">> 자연수 판별) 숫자 입력 : ");
        int number = scanner.nextInt();
        
        // 입력받은 숫자 판별하기
        if ( number >= 0 ) {
            System.out.println("자연수 입니다.");
        } else {
            System.out.println("음의 정수 입니다.");
        }
        System.out.println("-------------------------------");
        
        
        System.out.println("문2)");
        
        // 받을 나이 변수 선언 및 사용자로 부터 나이 입력받기
        System.out.print(">> 미성년자 판별) 나이 입력 : ");
        int age = scanner.nextInt();
        
        // 조건식에 나이 범위 설정 후 판별
        /*
        if ( age < adultAge ) {
            System.out.println("미성년자 입니다.");
        } */
        
        if ( age < 19 ) {
            System.out.println("미성년자 입니다.");
        } else {
            System.out.println("성인 입니다.");
        }
        
        System.out.println("-------------------------------");
        
        System.out.println("문3)");
        // 받을 숫자의 변수 선언 및 입력받기
        System.out.print(">> 홀수 판별) 숫자 입력 : ");
        number = scanner.nextInt();
        
        // 받은 숫자변수 판별
        if ( number % 2 == 1 ) {
            System.out.println("홀수 입니다.");
        } else {
            System.out.println("홀수가 아닙니다.");
        }
        System.out.println("-------------------------------");
        
        // 그전 스캐너의 공백 비움
        scanner.nextLine();
        System.out.println("문4)");
        
        // 입력받을 아이디와 패스워드 변수 선언 및 입력 
        System.out.print(">> 로그인 힌트 admin) 아이디 입력 : ");
        String myId = new String(scanner.nextLine());
        
        System.out.print(">> 로그인 힌트 111) 비밀번호 입력 : ");
        String myPw = new String(scanner.nextLine());
        
        // 입력받은 id pw 모두 일치한지 판별
        /*
        if ( myId.equals(id) && myPw.equals(pw) ) {
            System.out.println("로그인 성공");
        }*/
        
        if( myId.equals("admin") && myPw.equals("111")) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
       
        System.out.println("-------------------------------");
        
        System.out.println("문5)");
        System.out.print(">> 두자리 이하 자연수 판별) 숫자 입력 : ");
        number = scanner.nextInt();
        
        // 범위 설정
        if ( number >= 0 && number < 100 ) {
            System.out.println("두자리 이하 자연수 입니다.");
        } else {
            System.out.println("두자리 이하의 자연수가 아닙니다.");
        }
        
        System.out.println(">>> 프로그램 종료 ");
        scanner.close(); // !! 빼먹지마,,,
        
    }
}
