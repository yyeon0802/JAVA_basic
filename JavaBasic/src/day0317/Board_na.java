package day0317;

public class Board_na {
    private String writer;
    private String title;
    private String content;
    
    public void setWriter(String writer) {
        this.writer = new String(writer);
    }
    
    public String getWriter() {
        return writer;
    }

    public void setTitle(String title) {
        this.title = new String(title);
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setContent(String content) {
        this.content = new String(content);
    }
    
    public String getContent() {
        return content;
    }
    
    
    public void showContent() {
        System.out.printf("\t<  %s  >\n" , title);
        System.out.printf("내용 : %s\n", content);
    }
}
