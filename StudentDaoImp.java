import java.util.List;
import java.util.ArrayList;

public class StudentDaoImp implements StudentDao {

    List<Student> students;

    StudentDaoImp() {
        students = new ArrayList<Student>();
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void addStudent(Student Student) {
        students.add(Student);
    }

    public void updateStudentYear(Student Student) {
        students.get(Student.getId()).setYear(Student.getYear());
    }

    public void updateStudentCourse(Student Student) {
        students.get(Student.getId()).setCourse(Student.getCourse());
    }

    public void deleteStudent(Student Student) {
        //
    }

    public void updateStudent(Student Student) {
        //
    }
}
