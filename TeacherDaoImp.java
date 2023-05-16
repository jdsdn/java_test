import java.util.List;
import java.util.ArrayList;

public class TeacherDaoImp implements TeacherDao {

    List<Teacher> teachers;

    TeacherDaoImp() {
        teachers = new ArrayList<Teacher>();
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public Teacher getTeacher(int id) {
        return teachers.get(id);
    }

    public void addTeacher(Teacher Teacher) {
        teachers.add(Teacher);
    }

    public void updateTeacherPosition(Teacher Teacher) {
        teachers.get(Teacher.getId()).setPosition(Teacher.getPosition());
    }

    public void updateTeacher(Teacher Teacher) {
        // 
    }

    public void deleteTeacher(Teacher Teacher) {
        // 
    }
    
}
