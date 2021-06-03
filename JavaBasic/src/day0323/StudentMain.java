package day0323;

import java.util.Scanner;

import util.ScannerUtil;

//polymorphism을 본격적으로 경험해보자
public class StudentMain {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        StudentImpl studentImpl = new StudentImpl();
        //부모 클래스/인터페이스 변수는 자식 클래스의 생성자를 호출 가능하다.
        
        System.out.println("1. ElemenStudent");
        Student s = new ElemenStudent();

        studentImpl.showLife(s);
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("2. MiddleSchoolStudent");
        // Student 인터페이스 변수 S에 이번에는
        // MiddleSchoolStudent의 생성자를 호출하고
        // showLife()에 넣어보자

        s = new MiddleSchoolStudent();
        
        studentImpl.showLife(s);
        System.out.println("---------------------------------");
        System.out.println();
        
        System.out.println("3. HighSchoolStudent");
        // Student 인터페이스 변수 S에 이번에는
        // HighSchoolStudent의 생성자를 호출하고
        // showLife()에 넣어보자
        
        s = new HighSchoolStudent();
        
        studentImpl.showLife(s);
        System.out.println("---------------------------------");
        System.out.println();
    
        String message = new String("1.초딩 2.중딩 3.고딩");
        int userChoice = ScannerUtil.nextInt(scanner, message);
        if(userChoice == 1) {
            s = new ElemenStudent();
        } else if (userChoice == 2) {
            s = new MiddleSchoolStudent();
        } else if (userChoice == 3) {
            s = new HighSchoolStudent();
        }
    
        studentImpl.showLife(s);

    }
}
