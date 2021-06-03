package day0323;
// "Wolf"를 상속받는 Dog.java
public class Dog extends Wolf {
    public Dog() {
        System.out.println("Dog 클래스 생성자 호출");
    }
    
    public void loyal() {
        System.out.println("충성을 바친다.");
    }
    public void domestic() {
        System.out.println("가축화가 되었다.");
    }
    public void eat() {
        System.out.println("사료를 먹는다.");
    }//늑대클래스로 부터 상속 받은 메소드이지만 어울리게 사용하기 위하여 오버라이드 
}
