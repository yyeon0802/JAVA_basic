package model;

public class TeacherMain {
    public static void main(String[] args) {
        TeacherDTO t = new TeacherDTO();
        t.setId(1);
        t.setName("조재영");
        t.setUsername("t1");
        t.setPassword("1");
        t.setGroup(1);
        
        //  System.out.println() 메소드의 경우 
        // 파라미터로 Object o, 즉 어떤 클래스의 객체가 들어오던간에 
        // 그 객체
        
        System.out.println(t);
    }
    
}
