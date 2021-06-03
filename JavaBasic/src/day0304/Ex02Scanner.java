package day0304;

// Scanner
//  - Scanner 클래스는 자바에서 다양한 입력을 처리해주는 클래스이다.
//    우리가 사용자로부터 키보드 입력을 받기 위해서는 이 스캐너 클래스의 객체를 만들어서
//    그 객체의 메소드를 실행하여 입력을 받아야한다.

//  - 단,  Scanner는 자바에서 기본으로 포함해주는 클래스가 아닌 추가적인 클래스 이므로
//    우리가 "수입(import)" 해와야 한다.

import java.util.Scanner;
public class Ex02Scanner {
    public static void main(String[] args) {
        // Scanner 객체를 선언과 초기화 해보자
        // 단, 초기화 시에는 반드시 어디서 입력을 읽어올지 지정해와야 하기 때문에
        // 키보드입력을 할때에는 () 안에 System.in 이라고 적어주어야 한다.
        
        Scanner scanner = new Scanner(System.in);
    
        // 1. 사용자로부터 int를 입력 받을 때에는
        //    스캐너 객체의 nextInt() 메소드를 실행하면 된다.
        System.out.print("숫자 : ");
        int userNumber = scanner.nextInt();
        
        System.out.println("사용자가 입력한 숫자 : " + userNumber);
        System.out.println();
        
        // 2. 사용자로부터 double을 입력 받을 때에는
        //    스캐너 객체의 nextDouble() 메소드를 실행하면 된다.
        System.out.print("실수 : ");
        double userDouble = scanner.nextDouble();
        
        System.out.println("사용자가 입력한 실수 : " + userDouble);
        System.out.println();
        
        //  Scanner와 같이 외부에서 무언가 값을 "읽어" 오는 클래스 객체는 
        //  프로그램의 가장 마지막 줄에 close() 메소드를 호출해주는 것이 좋다.
        //  버퍼메모리를 놓아달라는 뜻. 메모리 루스를 막아라

        // 3. 사용자로부터 String을 입력 받을 때에는
        //    스캐너 객체의 nextLine() 메소드를 실행하면 된다.
        //     ** 주의
        //        만약 nextInt() nextDouble() 등의 숫자, 실수를 입력하는 메소드를 실행하고 나서
        //        nextLine()메소드를 실행하게 된다면
        //        nextInt() nextDouble()에서 사용자가 입력을 종료하기 위해서 눌렀던 엔터키(공백문자 \n)이
        //        버퍼 메모리에 남아 있고 그 엔터키를 보고 nextLine()메소드는
        //        "사용자가 아무런 글자 입력을 하지 않고 입력을 종료했다"고 인식하는 버그가 존재한다.
        //     ** 해당 버그를 해결하기 위해 
        //        nextInt() nextDouble() 등의 숫자, 실수를 입력하는 메소드 "이후에는" 반드시
        //        ** nextLine() 메소드를 사용해 버퍼메모리를 비워주고
        //        그 다음 String입력을 nextLine()으로 받아주어야 한다.
        
        // 단, 프로그램을 시작하자마 String 입력을 위해 nextLine()을 쓰는 경우,
        // 이는 버퍼 메모리가 깨끗한 상태이기 때문에 nextLine()을 두번 적어줄 필요가 없다.
        
        //    왜냐, 버퍼메모리에 있는 엔터가 이미 입력을 끝낸 것으로 인식되어 
        //    더이상 입력이 되지 않는다.
        //    - String이라 패턴체크가 필요한가?
        System.out.print("이름 : ");
        // 앞에 실행된 nextInt() nextDouble()의 버퍼메모리에 엔터(""남은 공백)를 가져가주는 메소드 필요
        scanner.nextLine(); // 버퍼 메모리를 비워주는 용도
        String name = new String(scanner.nextLine());
        
        System.out.println("사용자의 이름 : " + name);
        System.out.println();
        
        
        
        scanner.close();
    }
}
