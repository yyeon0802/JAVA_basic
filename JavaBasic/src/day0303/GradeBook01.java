package day0303;
// 직접 변수를 만들어서 다음과 같은 형태로 출력이 될 수 있게 작성하라 (10분)

// 번호 : #번
// 이름 : ###
// 국어 : ##점
// 영어 : ##점
// 수학 : ##점
// 총점 : ##점
// 평균 : ##.####점
public class GradeBook01 {
    public static void main(String[] args) {
        
        /*
         * 변수선언 다 하고 코드짤것,,,
        int studentNumber = 1;
        System.out.println("번호 : " + studentNumber + "번");
         ->이렇게 중간에 하지말 것
        
        String studentName = new String("홍길동");
        System.out.println("이름 : " + studentName);
        
        int koreanScore = 60;
        int englishScore = 64;
        int mathScore = 70;
        int totalScore = (koreanScore + mathScore);
        double average = (totalScore / 3); //여기!
        
        System.out.println("국어 : " + koreanScore + "점");
        System.out.println("영어 : " + englishScore + "점");
        System.out.println("수학 : " + mathScore + "점");
        System.out.println("총점 : " + totalScore + "점");
        System.out.println("평균 : " + average + "점");
        */
        
        int id = 3;
        String name = new String("조재영");
        int korean = 80;
        int english = 81;
        int math = 81;
        // 총점과 평균은 우리가 직접 값을 입력해서 계산을 해 주는 것이 아니라
        // 우리가 만든 변수를 기준으로 할당을 해주어야 한다.
        int sum = korean + english + math;
        double average = sum / 3.0; //함정 int / int 하면 double이 나올까?
        
        // 출력
        System.out.println("번호 : " + id + "번");
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + korean + "점");
        System.out.println("영어 : " + english + "점");
        System.out.println("수학 : " + math + "점");
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + average + "점");
        
    }
}
