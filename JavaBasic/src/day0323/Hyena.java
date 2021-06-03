package day0323;

//"Canis" 클래스를 상속 받는 하이에나 클래스
// 하이에나 = 비열해보임, 시체를 먹음
// 2가지 메소드가 있다.

public class Hyena extends Canis {
    public Hyena() {
        System.out.println("Hyena 생성자 호출");
    }
    
    public void nasty() {
        System.out.println("비열해 보임.");
    }
    
    public void eat() {
        System.out.println("시체를 먹는다.");
    }
    
}
