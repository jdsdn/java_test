import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int id);
    public void addStudent(Student Student);
    public void updateStudent(Student Student);
    public void deleteStudent(Student Student);
}
