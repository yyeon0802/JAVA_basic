package day0304;
// 직접 변수를 만들고 다음과 같은 형식을 갖추어 출력할 수 있게 작성하시오

// 번호 : ###번 이름 : ###
// 국어 : 0##점 영어 : 0##점 수학 : 0##점
// 총점 : 0##점 평균 : 0##.##점


public class GradeBook01 {
    public static void main(String[] args) {
     
        int id = 123;
        String name = new String("홍길동");
        int korean = 88;
        int english = 76;
        int math = 98;
        int sum = korean + english + math;
        double average = sum / 3.0; 

        System.out.printf("번호 : %03d번 이름 : %s \n" , id , name);
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점 \n", korean, english , math);
        System.out.printf("총점 : %03d점 평균 : %06.2f점 \n", sum , average);
        
        /*
         System.out.print("번호 : " + id + "번" + "\t");
        System.out.print("이름 : " + name + "\n");
        System.out.printf("국어 : %03d점 \t" , korean);
        System.out.printf("영어 : %03d점 \t" , english);
        System.out.printf("수학 : %03d점 \t" , math);
        System.out.println();
        System.out.printf("총점 : %03d점 \t" , sum );
        System.out.printf("평균 : %06.2f점" , average ); //점도 출력하는 자리!
         */
            
    }  
    
}
