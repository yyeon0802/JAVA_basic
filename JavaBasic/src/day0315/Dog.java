package day0315;
//강아지 클래스
// 필드 : 이름, 등록번호(String), 품종, 나이
// 메소드 : 사료먹기(사료종류), 짖기(), 잠자기(), 객체간 비교()


public class Dog {
    
    // 1. 필드(속성) // private 쓰고 getter setter 해서 캡슐화 하자
    private String name;
    private String id;
    private String breed;
    private int age;
    
   
    // 2. 메소드
    // 캡슐화
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setId (String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void setBreed (String breed) {
        this.id = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    // 파라미터가 있는 생성자 
    public Dog(String name, String id, String breed, int age) {
        this.name = name;
        this.id = id;
        this.breed = breed;
        this.age = age;
    }
    
    // 기본 생성자
    public Dog() {
        
    }
    
    public void printInfo() {
        System.out.println("------------------------------------");
        System.out.printf("등록번호 : %s 이름 : %s\n", id, name);
        System.out.printf("품종 : %s 나이 : %02d살\n", breed, age);
        System.out.println("------------------------------------");
    }
    
    
    public void eat(String food) {
        System.out.println( food + "를 먹습니다.");
    }
    public void bark() {
        System.out.println("멍멍");
    }
    
    public void sleep() {
        System.out.println("쿨쿨");
    }
    
    public boolean equals(Object obj) {
        if ( obj instanceof Dog ) {
            Dog d = (Dog) obj;
            if ( this.id.equals(d.id)) { //  이 안에 있어야 ! 여기선 this 생략 가능
                return true;
            }
        }
        
       return false;
    }
    
    
    
}
