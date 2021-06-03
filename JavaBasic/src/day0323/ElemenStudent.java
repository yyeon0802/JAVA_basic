package day0323;
//Student 인터페이스를 상속받는 ElemenStudent 클래스

public class ElemenStudent implements Student{

    @Override
    public void study() {
        System.out.println("슬기로운 생활, 즐거운 생활을 공부합니다.");
    }

    @Override
    public void goSchool() {
        System.out.println("1교시인 9시까지 걸어갑니다.");
    }

    @Override
    public void eat() {
        System.out.println("급식이 맛있다!");
    }

    @Override
    public void test() {
        System.out.println("받아쓰기 100점");
    }
    

}
