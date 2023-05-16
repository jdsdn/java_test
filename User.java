public class User {

    private int age;
    private String fname;
    private String lname;
    private String gender;

    User(int age, String fname, String lname, String gender) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getFullname() {
        return fname + " " + lname;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
