package day0304;

// 사용자로 부터
// 번호, 이름, 국어, 영어, 수학점수를 차례대로 입력을 받아서
// 다음과 같은 형식으로 출력

// 번호 : ###번 이름 : ###
// 국어 : 0##점 영어 : 0##점 수학 : 0##점
// 총점 : 0##점 평균 : 0##.##점

import java.util.Scanner;
public class GradeBook02 {
    
    // 프로그램 내부적으로 사용할 상수constant들 
    // 1. 과목의 숫자
    static final int SUBJECT_SIZE = 3;
    
    public static void main(String[] args) {
        
        // 정보 입력  --> 하기 전 미리 구조를 생각해보자
        Scanner scanner = new Scanner(System.in);
        
        // 번호 입력
        System.out.print("번호를 입력하세요 : ");
        int id = scanner.nextInt();
        // System.out.println("번호");
        // System.out.print("> ");
        // int id = scanner.nextInt(); 이런식으로도 쓴다..
        
        
        // 이름 입력
        scanner.nextLine(); // 먼저 제거해,,,
        System.out.print("이름을 입력하세요 : ");
        String name = new String(scanner.nextLine());
        
        // 국어 입력
        System.out.print("국어 성적을 입력하세요 : ");
        int korean = scanner.nextInt();
        // 영어 입력
        System.out.print("영어 성적을 입력하세요 : ");
        int english = scanner.nextInt();
        // 수학 입력
        System.out.print("수학 성적을 입력하세요 : ");
        int math = scanner.nextInt();
        
        // 총점과 평균 계산 / 선언한 상수가 int기 때문에 typecast해야한다
        int sum = korean + english + math;
        double average = sum / (double)SUBJECT_SIZE; // /3.0은 하드코딩,,,소프트코딩으로 바꿔보자
        
        // 정보 출력
        System.out.println();
        System.out.printf("번호 : %03d번  이름 : %s \n" , id , name);
        System.out.printf("국어 : %03d점  영어 : %03d점  수학 : %03d점 \n" , korean , english , math);
        System.out.printf("총점 : %03d점  평균 : %06.2f점 \n" , sum , average);
        
        scanner.close();
    }
}
