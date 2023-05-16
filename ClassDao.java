import java.util.List;

public interface ClassDao {
    public List<Class> getAllClasses();
    public Class getClass(int code);
    public void addClass(Class Class);
    public void updateClass(Class Class);
    public void deleteClass(Class Class);
    public void updateClassTeacher(Teacher teacher);
    public void updateClassTeacher(Class c1, Teacher teacher);
    public void setTeacher(Class c1, Teacher teacher);
    public void updateClassSubject(Class class1, Subject subject);
    public int getSize();
    public List<Student> getAllStudents(int code);
}
