public class Student {

    User user;
    private int id;
    private int year;
    private String course;

    Student(int id, String course, int year, User user) {
        this.id = id;
        this.user = user;
        this.year = year;
        this.course = course;
    }

    public User getUser() {
        return user;
    }

    public int getId() {
        return id;
    }
    
    public int getYear() {
        return year;
    }

    public String getCourse() {
        return course;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
