package model;

import java.util.Calendar;

public class EvaluationDTO {

    private int id;
    private int studentId;  // 글쓴애
    private int teacherId;  // 게시판번호같은거
    private String content; //평가
//    private int group;
    private Calendar writtenDate;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    /*
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }*/
    
    public Calendar getWrittenDate() {
        return writtenDate;
    }
    public void setWrittenDate(Calendar writtenDate) {
        this.writtenDate = writtenDate;
    }
    
    
    // equals()
    public boolean equals(Object o) {
        if (o instanceof EvaluationDTO) {
            EvaluationDTO e = (EvaluationDTO) o;
            if (id == e.id) {
                return true;
            }
        }
        return false;
    }
    
    
    
}
