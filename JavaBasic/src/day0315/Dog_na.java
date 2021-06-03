package day0315;
//강아지 클래스
// 필드 : 이름, 등록번호(String), 품종, 나이
// 메소드 : 사료먹기(사료종류), 짖기(), 잠자기(), 객체간 비교()


public class Dog_na {
    String name;
    String idNumber;
    String species;
    int age;
    
    public void feeding(String feed) { // 리턴타입 없다고,,, 왜 빼먹음?
        System.out.println( feed + "를 먹습니다.");
    }
    public void bark() {
        System.out.println("왕왕");
    }
    
    public void sleep() {
        System.out.println("잡니다.");
    }
    
    public boolean compare(Object o) {
        if ( o instanceof Dog_na ) {
            Dog_na d = (Dog_na) o;
            if ( this.idNumber.equals(d.idNumber)) {
                return true;
            }
        }
        
       return false;
    }
}
