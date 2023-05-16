public class Teacher {

    User user;
    private int id;
    private String position;

    Teacher(int id, String position, User user) {
        this.id = id;
        this.user = user;
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
