package day0323;
// Student 인터페이스를 상속받는 MiddleSchoolStudent 클래스
public class MiddleSchoolStudent implements Student {

    @Override // @ Annotation 이라는 분법으로 ,
    //@뒤의 기능을 메소드에 검사하거나 무언가 특정 기능을 부여할 때 사용이 된다.
    //@ override어노테이션은 해당 메소드가 부모 클래스/인터페이스 메소드를 오버라이드 했으므로
    // 부모 클래스가 선언한 것과 똑같은지 활실하게 체크하라는 의미이다
    public void study() {
        System.out.println("대충 대충 공부합니다.");
    }

    @Override
    public void goSchool() {
         System.out.println("1교시인 8시 반까지 학교에 갑니다.");
    }

    @Override
    public void eat() {
        System.out.println("점심은 급식 저녁은 집밥.");
    }

    @Override
    public void test() {
        System.out.println("중간 고사랑 기말 고사만 잘 보면 되지!");

    }

}
