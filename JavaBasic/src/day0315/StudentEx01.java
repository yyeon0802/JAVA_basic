package day0315;

public class StudentEx01 {
    public static void main(String[] args) {
        //파라미터 있는 생성자로 연습
        //Student s = new Student(1, "김또치", 80, 80, 81);
        
        // 파라미터가 없는 생성자로 연습
        //Student s= new Student();
        //s.showInfo();
        
//        Student s;
//        s = new Student();
//        System.out.println(s); -> 찍어보면 아직 초기화가 되어 있지 않다고 에러 남

       
          
        Student s = null;
        System.out.println(s);
        s= new Student();
            
            
        s.showInfo();
        
        s.id   =    1;
        s.name  =   new String("조재영");
        s.korean =  80;
        s.english = 81;
        s.math =    74;
        
        s.showInfo();
        
        Student s2 = new Student(1, "김둘리", 80, 80, 81);
        s2.id   =    1;
        s2.name  =   new String("조재영");
        s2.korean =  80;
        s2.english = 81;
        s2.math =    74;
        
        s2.showInfo();
        
        System.out.println("s1.equals(s2) : " + s.equals(s2));
        String str = new String("안녕하세요.");
        System.out.println("s.equals(str) : " + s.equals(str));
        
        
    }
}
