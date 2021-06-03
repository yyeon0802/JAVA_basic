package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.EvaluationDTO;
import model.StudentDTO;
import model.TeacherDTO;
import java.util.Calendar;
public class EvaluationController {
    
    private ArrayList<EvaluationDTO> list;
    private int id;
    
    
    public EvaluationController() {
        list = new ArrayList<>();
        id = 1;
        EvaluationDTO e1 = new EvaluationDTO();
        e1.setId(id++);
        e1.setStudentId(1);
        e1.setTeacherId(1);
        e1.setContent("좋아요");
        e1.setWrittenDate(Calendar.getInstance());
        list.add(e1);
        
        e1 = new EvaluationDTO();
        e1.setId(id++);
        e1.setStudentId(2);
        e1.setTeacherId(2);
        e1.setContent("정말 좋아요");
        e1.setWrittenDate(Calendar.getInstance());
        
        list.add(e1);
        
    }
    
    // 뭐가 필요하지
    // 컨텐츠 작성 (무엇으로 받아서 작성할것인가?)
    // - 일단 글쓴애가 학생일것
    // - 로긴했으니 id가 학생id랑 일치한지 알것이고
    // - 개별보기 userChoice 가 id가 될것
    // - 그럼 userChoice가 teacherDTO에 id와 일치해야할것 ->이거도 개별보기 성공했으니 일치할거고
    // - 교사랑 학생이랑 반이 같아야 한다 이거로 체크
    // int logIn.getId getGroup / 날짜요 를 파라미터로 프린트하고 
    /*
    public void setContent(int studentId, int teacherId, int group, String str) { //logIn.getId(); , userChoice
        EvaluationDTO e = new EvaluationDTO();
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        e.setId(id++);
        e.setStudentId(studentId);
        e.setTeacherId(teacherId);
        e.setGroup(group);
        e.setContent(str);
        e.setWrittenDate(sdf.format(Calendar.getInstance())); //아 이걸 왜 여기다 집어넣어
    }
    // 작성한 컨텐츠 불러오는거 그니까
    // 교사평가하기 눌렀을때 평가한 아아ㅏㅏ 아니다 같은반 담임선생님인지만 체크하면 된다ㅏㅏ
    // 평가가 있어도 없어도 상관없음 여러명이 평가 가능
    */
    
    // 1. id 값을 받으면 해당 id 값과 일치하는 EvaluationDTO 객체를 리턴하는
    //    selectOne()메소드
    public EvaluationDTO selectOne(int id) {
        for (EvaluationDTO e : list) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
    
    // 2. 교사의 id값을 받으면 해당 id값과 일치하는 EvaluatonDTO객체들을
    //    ArrayList에 담아서 return하는 selectById()메소드
    public ArrayList<EvaluationDTO> selectById(int teacherId){
        ArrayList<EvaluationDTO> temp = new ArrayList<>();
        for (EvaluationDTO e : list) {
            if (e.getTeacherId() == teacherId) {
                temp.add(e);
            }
        }
        return temp;
    }
    
    // 사용자가 입력한 값을 EvaluationDTO의 객체형태로 받아서
    // list에 추가하는 add() 메소드
    public void add(EvaluationDTO e) {
        e.setId(id++);
        e.setWrittenDate(Calendar.getInstance());
        list.add(e);
    }
    
    // 사용자가 입력한 id값과 일치하는 EvaluationDTO객체를 삭제하는
    // delete 메소드
    public void delete(EvaluationDTO e) {
        list.remove(e);
    }
    
    // 사용자가 기존에 정보를 입력했는지 안했는지 알려주는
    // validateStudentId()
    public boolean validateStudentId(int studentId) {
        for (EvaluationDTO e : list) {
            if (studentId == e.getStudentId()) {
                return true;
            }
        }
        return false;
    }
    
}
