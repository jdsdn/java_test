import java.util.List;
import java.util.ArrayList;

public class ClassDaoImp implements ClassDao {

    List<Class> classes;

    ClassDaoImp() {
        classes = new ArrayList<Class>();
    }

    public List<Class> getAllClasses() {
        if(classes.size() <= 0) System.out.println("Classlist Empty");
        return classes;
    }

    public List<Student> getAllStudents(int code) {
        return classes.get(code).getStudents();
    }

    public Class getClass(int code) {
        return classes.get(code);
    }

    public void addClass(Class Class) {
        classes.add(Class);
    }

    public void addStudent(Class Class, Student student) {
        classes.get(Class.getCode()).addStudent(student);
    }

    public void updateClassSubject(Class Class, Subject subject) {
        classes.get(Class.getCode()).setSubject(subject);
    }

    public void updateClassName(Class Class) {
        classes.get(Class.getCode()).setName(Class.getName());
    }

    public void updateClassTime(Class Class) {
        classes.get(Class.getCode()).setTime(Class.getTime());
    }

    public void updateClass(Class Class) {
        //
    }

    public void deleteClass(Class Class) {
        classes.remove(Class.getCode());
    }

	public void updateClassTeacher(Teacher teacher) {
		// throw new UnsupportedOperationException("Unimplemented method 'updateClassTeacher'");
	}

	public void updateClassTeacher(Class Class, Teacher teacher) {
        classes.get(Class.getCode()).setTeacher(teacher);
	}

	public void setTeacher(Class c1, Teacher teacher) {
        //
	}

    public int getSize() {
        return classes.size();
    }
}
