package model;
// MVC패턴
//  - 클래스 분리를 할 때 사용 가능한 한가지 개발 패턴으로써
//    클래스들을 3가지 큰 분류로 나누어서 개발하는 방법이다.
//  M : model
//     - 모델은 컨트롤러가 뷰어에 데이터를 보내줄때나, 
//      뷰어가 보내준 데이터를 데이터 베이스로 보낼때
//      해당 데이터들을 클래스 객체의 형태로 가공해주는 클래스의 종류.
//     - 해당 클래스는 말 그대로 사용자의 입력값이나 아니면 데이터베이스로부터 읽어온 값을
//       객체의 형태로 가공만 해주기 때문에, 필드, 겟터 / 셋터 그리고  java.lang.Object로 부터 상속받은 메소드 중
//       오버라이드할 메소드만 적혀져 있다.
//     - 모델의 경우 이름이 DTO혹은 VO로 끝날 때가 많은데
//       만약 해당 객체의 값이 수정도 되는 경우에는 DTO, 값을 읽어오는 용도일 때에는 VO라고 하지만
//       사실 의미하는 바가 큰 차이가 없으므로 둘 중 아무거나 적어도 되긴 한다.
//  V : Viewer
//     - 뷰어는, 화면에 출력을 담당하는 클래스가 된다.
//       다만 웹을 통해 출력할 때에는 뷰어 클래스가 딱히 없을 수도 있는데
//       왜냐면 컨트롤러가 직접 웹한테 필요한 데이터를 전송하게 되면 생략 가능하기 때문이다.
//       만약 웹인데도 뷰어 클래스를 사용하는 경우는, 웹에서 출력할 내용을 뷰어가 모두다 만들어서 보내주는 경우가 그런 경우이다.
//       뷰어의 경우 이름이 Viewer로 끝난다.
//  C : Controller
//     -  컨트롤러는, 뷰어의 요청에 따라서 데이터를 가공하거나 보내주는 역할을 맡는 클래스이다.
//        데이터베이스가 있을 경우에는 뷰어의 요청에 맞춰서 CRUD를 하게 된다.
//        컨트롤러의 경우 이름이 controller러 끝난다.

// CRUD?
//  - CRUD란 데이터베이스의 가장 기본적인 기능인데
//    데이터를 만들고(Create) 불러오고(Retrieve) 수정하고(Update) 삭제한다(Delete)

public class StudentDTO {
    // 필드
    private int id;
    private String name;
    private String username;
    private String password;
    private int group;
    private int korean;
    private int english;
    private int math;
    private boolean inputSwitch;


    // getters/setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
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
    public boolean isInputSwitch() {
        return inputSwitch;
    }
    public void setInputSwitch(boolean inputSwitch) {
        this.inputSwitch = inputSwitch;
    }
    
    
    // equals()
    public boolean equals(Object o) {
        if ( o instanceof StudentDTO) {
            StudentDTO s = (StudentDTO) o;
            if ( id == s.id) {
                return true;
            }
        }
        return false;
    }
    
    
}
