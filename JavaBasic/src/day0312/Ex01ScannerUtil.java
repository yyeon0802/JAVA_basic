package day0312;

// ScannerUtil 실험하는 클래스

import java.util.Scanner;
import util.ScannerUtil; // 다른클래스(클래스 util)에 생성한 ScannerUtil 메소드
public class Ex01ScannerUtil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 우리가 기존에 nextInt() 이후에 nextLine()을 쓰는 경우
        // 다음과 같은 양식이었다,,,
        System.out.println("기존 방법");
        System.out.println("나이");
        System.out.print(">  ");
        int age = scanner.nextInt();
        
        System.out.println("이름");
        System.out.print(">  ");
        scanner.nextLine();
        String name = new String(scanner.nextLine());
        
        System.out.printf("이름 : %s 나이 : %d세\n" , name , age);
        
        // 하지만 ScannerUtil을 사용하면 우리가 다음과 같이 코드가 짧아진다
        // 단, ScanneUtil도 다른패키지에 있는 클래스이기에 우리가 import를 해야한다.
        System.out.println();
        System.out.println("스캐너 유틸 버전");
        age = ScannerUtil.nextInt(scanner, "나이를 입력해주세요." , 1 , 100);
        
        // nextInt()다음에 실행 되는지 확인
        name = ScannerUtil.nextLine(scanner, "이름을 입력해 주세요.");
        // nextLine()다음에 실행 되는지 확인
        String job = ScannerUtil.nextLine(scanner, "직업을 입력해 주세요.");
        
        System.out.printf("이름 : %s 나이 : %d세 직업 : %s\n" , name , age , job);
        
        
        
        
        scanner.close();
        
    }

}
