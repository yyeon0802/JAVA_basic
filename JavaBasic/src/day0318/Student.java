package day0318;

// 캡슐화

// 객체 지향 프로그래밍에서는
// 우리가 만든 클래스의 세부적 내용을 
// 굳이 바깥에서 알 필요없다고 보고
// 따라서 우리 클래스 안에
// 모든 필드 그리고 바깥이 몰라도 되는 메소드의 경우
// 아예 볼 수 없게
// 접근 제한을 하게 된다. 하지만 우리가 필드에 접근 제한자를 사용하게 된다면?
// 외부 클래스에서 객체를 생성하더라도
// 필드에 값을 직접 넣어줄 수 없게 된다!

// 대신 우리가 메소드를 만들어서 해당 메소드를 사용하여
// 간접적으로 값을 넣어주거나, 아니면 호출하게 된다.

// private으로 설정된 필드에 값을 넣을 때에는
// 우리가 setter 메소드를 사용하게 된다.
// --> setter 메소드 형식
//     public void set필드명(필드타입 필드명) {
//          this.필드명 = 필드명;
//      }

// private으로 설정된 필드에서 값을 호출할 때에는
// 우리가 getter 메소드를 사용하게 된다.
// --> getter 메소드 형식
//     public 필드타입 get필드명() {
//          return 필드명;
//      }

// Student 클래스 ver 2.0
// 캡슐화의 개념이 적용된 Student 클래스

public class Student {

    private int id;
    private String name;
    private int korean;
    private int english;
    private int math;
    private final int SIZE = 3;

    // id에 대한 getter / setter
    public void setId ( int id ) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    // name에 대한 getter / setter
    public void setName(String name) {
        this.name = new String(name);
    }
    
    public String getName() {
        return name;
    }
    
    // 국어점수에 대한 getter / setter
    public void setKorean(int korean) {
        this.korean = korean;
    }
    
    public int getKorean() {
        return korean;
    }
    
    // 영어점수에 대한 getter / setter
    public void setEnglish(int english) {
        this.english = english;
    }
    
    public int getEnglish() {
        return english;
    }
    
    // 수학점수에 대한 getter / setter
    public void setMath(int math) {
        this.math = math;
    }
    
    public int getMath() {
        return math;
    }
    
    
    
    private int calculateSum() { // showInfo 메소드를 위한 메소드라,, 숨기자 외부에서 안 쓴다.
        return korean + english + math;
    }
    
    private double calculateAverage() { // showInfo 메소드를 위한 메소드라,, 숨기자 외부에서 안 쓴다.
        return calculateSum() / (double)SIZE;
    }
    
    public void showInfo() {
        System.out.printf("번호 : %03d번 이름 : %s \n", id, name);
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점 \n" , korean, english, math);
        System.out.printf("총점 : %03d점 평균 : %06.2f점 \n", calculateSum(), calculateAverage() );
    }
    
    // 생성자
    
    // 파라미터가 있는 생성자 / 얘는 외부에서 필요하면 쓸수 있지
    public Student(int id, String name, int korean, int english, int math) {
        this.id = id;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    
    }
    
    // 파라미터가 없는 생성자
    public Student() { // ex. Student s = new Student();
        id = -1;
        name = new String("아직 입력 안 됨");
        korean = -1;
        english = -1;
        math = -1;
    }
    
    // override  메소드
    //  1. equals()
    public boolean equals(Object o) {
        if ( o instanceof Student ) {

            Student s = (Student) o;
            
            if ( id == s.id ) {
                return true; 
            }
        }
        
        return false;
    }
}










