package controller;
// 뷰어에 요청에 맞춰서 데이터를 가공해주는 컨트롤러
// 원래대로라면 데이터베이스를 왔다갔다하면서 데이터를 CRUD해야하지만
// 우리는 데이터베이스가 없으므로
// 이 안에 ArrayList<>를 이용하여 유사 데이터베이스를 만들어보게 될것이다.

import java.util.ArrayList;
import model.TeacherDTO;

public class TeacherController {
    // TeacherDTO 목록을 담당할 ArrayList 필드 list
    private ArrayList<TeacherDTO> list;
    // 추가될 TeacherDTO의 id를 담당할 int 필드 id
    private int id;
    
    // 1. TeacherController() 생성자 하여간 초기화
    public TeacherController() {
        list = new ArrayList<>(); //ArrayList초기화
        id = 1;
        //걍 한명씩 넣으실 생각인가봄,,,
        TeacherDTO t = new TeacherDTO();
        t.setId(id++);
        t.setName("교사1");
        t.setGroup(1);
        t.setUsername("t1");
        t.setPassword("1");
        
        list.add(t);
        
        t = new TeacherDTO();
        t.setId(id++);
        t.setName("교사2");
        t.setGroup(2);
        t.setUsername("t2");
        t.setPassword("2");
        
        list.add(t);
        
        /*
        for (int i = 1; i <= 2; i++) {
            TeacherDTO t = new TeacherDTO();
        
            t.setId(id++);
            t.setName("교사" + i);
            t.setGroup(i);
            t.setUsername("s" + i);
            t.setPassword(Integer.toString(i));
            
            list.add(t);
        }*/
        
    }
    // 2. 사용자로부터 입력받은 TeacherDTO 객체 파라미터에
    //  나머지 정보를 추가해서 리스트에 추가하는 add()
    public void add(TeacherDTO t) {
        t.setId(id++);
        // 위에서 나머지는 다 입력했고 id만 남았기때문에 id만 셋하고 
        list.add(t);
        //리스트에 추가
    }
    
    // 3. 사용자가 입력한 TeacherDTO 객체의 username과 password가 일치하는
    //    list의 엘리먼트를!!!!!! 리턴해주는 auth 메소드
    public TeacherDTO auth(TeacherDTO user) {
        for (TeacherDTO t : list) {
            if (t.getUsername().equals(user.getUsername()) && t.getPassword().equals(user.getPassword())) {
                return t;
            }
        }
        return null;
    }
    
    // 4. 사용자가 입력한 username과 같은 username이 있으면
    //    true를 리턴하는 validateUserName() 메소드
    public boolean validateUsername(TeacherDTO user) {
        for (TeacherDTO t : list) {
            if (t.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }
    
    // 4. 사용자가 입력한 group이 중복인지 체크하는 
    //  validateGroup() 메소드
    public boolean validateGroup(TeacherDTO user) {
        for (TeacherDTO t : list) {
            if (t.getGroup() == user.getGroup()) {
                return true;
            }
        }
        return false;
    }
    
   // 사용자가 파라미터로 넘겨준 int값과 일치하는 group을 가진
   // TeacherDTO를 리턴해주는 selectOneByGroup()
    
    public TeacherDTO selectOneByGroup(int group) {
        for (TeacherDTO t : list) {
            if (t.getGroup() == group) {
                return t;
            }
        }
        return null;
    }
}
