package day0319;

public class Student {
    // 학생번호
    private int id;
    // 학생이 로그인 시 사용 할 아이디
    private String username;
    // 로그인 비밀번호
    private String password;
    // 학생의 이름
    private String name;
    // 소속반
    private int group;
    // 점수 입력 여부
    private boolean scoreInputSwitch;
    // 점수들
    private int korean;
    private int english;
    private int math;
    // 과목의 숫자를 저장한 상수
    private final int SUBJECT_SIZE = 3;

    // getter setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public boolean isScoreInputSwitch() {
        return scoreInputSwitch;
    }

    public void setScoreInputSwitch(boolean scoreInputSwitch) {
        this.scoreInputSwitch = scoreInputSwitch;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    // equals()
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            if (id == s.id) {
                return true;
            }
        }
        return false;
    }

    // 학생정보를 출력할 print()
    // 단 민감 정보인 아이디와 비밀번호는 출력하지 않는다.
    public void print() {
        System.out.println("==========================================");
        System.out.printf("소속 반 : %2d반 번호 : %2d번\n" , group, id);
        System.out.printf("이름 : %s\n" , name);
        System.out.println("==========================================");
        // 점수 출력 여부는 따로 출력을 해주는 것이 아니라
        // 점수 출력 자체를 결정 지어주는데 사용된다.
        if (scoreInputSwitch) { // 점수가 들어가야 아래 실행
            int sum = korean + english + math;
            double average = sum / (double)SUBJECT_SIZE;
            System.out.printf("국어 점수 : %03d 영어 점수 : %03d 수학 점수 : %03d\n",
                    korean, english, math);
            System.out.printf("총점 : %03d 평균 : %06.2f점\n", sum , average);
        } else {
          System.out.println();  
          System.out.println("아직 점수가 입력되지 않은 학생입니다.");  
          System.out.println();  
        }
        System.out.println("=========================================");
    }
   
    //로그인
    public boolean auth(Student s) {
        if (username.equals(s.username) && password.equals(s.password)) {
            return true;
        }
        return false;
    }
    
    
}
