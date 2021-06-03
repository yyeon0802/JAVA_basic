package cgv_model;

public class GradeDTO {
    private int index;
    private int userIndex;
    private int movieIndex;
    private int starPoint;
    private String comment;
    private boolean group1Input;
    private boolean group2Input;
    
    
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int getUserIndex() {
        return userIndex;
    }
    public void setUserIndex(int userIndex) {
        this.userIndex = userIndex;
    }
    public int getMovieIndex() {
        return movieIndex;
    }
    public void setMovieIndex(int movieIndex) {
        this.movieIndex = movieIndex;
    }
    public int getStarPoint() {
        return starPoint;
    }
    public void setStarPoint(int starPoint) {
        this.starPoint = starPoint;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public boolean isGroup1Input() {
        return group1Input;
    }
    public void setGroup1Input(boolean group1Input) {
        this.group1Input = group1Input;
    }
    public boolean isGroup2Input() {
        return group2Input;
    }
    public void setGroup2Input(boolean group2Input) {
        this.group2Input = group2Input;
    }
    
    public boolean equals(Object o) {
        if (o instanceof GradeDTO) {
            GradeDTO g = (GradeDTO) o;
            if (index == g.index) {
                return true;
            }
        }
        return false;
    }
    
}