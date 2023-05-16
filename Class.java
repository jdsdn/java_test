import java.util.List;
import java.util.ArrayList;

public class Class {

    private int code;
    private String name;
    private String time;

    Subject subject;
    Teacher teacher;
    List<Student> students;

    Class(int code, String name, String time, Subject subject, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.time = time;
        this.subject = subject;
        this.teacher = teacher;

        students = new ArrayList<Student>();
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Subject getSubject() {
        return subject;
    }

    ////////////////////////////////////////////////

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}
