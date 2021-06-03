package day0319;

public class Teacher {
    private int id;
    private String username;
    private String password;
    private String name;
    private int group;
    
    //getters setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    
    // equals()
    public boolean equals(Object o) {
        if ( o instanceof Teacher) {
            Teacher t = (Teacher) o;
            if (id == t.id) {
                return true;
            }
        }
        return false;
    }
  
    // 로그인
    public boolean auth(Teacher t) {
        if (username.equals(t.username) && password.equals(t.password)) {
            return true;
        }
        return false;
    }
    
    
    
}
