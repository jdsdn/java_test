import java.util.List;

public interface TeacherDao {
    public List<Teacher> getAllTeachers();
    public Teacher getTeacher(int id);
    public void addTeacher(Teacher Teacher);
    public void updateTeacher(Teacher Teacher);
    public void deleteTeacher(Teacher Teacher);
}
