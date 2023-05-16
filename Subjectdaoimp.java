import java.util.List;
import java.util.ArrayList;

public class Subjectdaoimp implements SubjectDao {

    List<Subject> subjects;

    Subjectdaoimp() {
        subjects = new ArrayList<Subject>();
    }

    public List<Subject> getAllSubjects() {
        return subjects;
    }

    public Subject getSubject(int code) {
        return subjects.get(code);
    }

    public void updateSubject(Subject Subject) {
        subjects.get(Subject.getCode()).setName(Subject.getName());
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void deleteSubject(Subject subject) {
        // subjects.remove(subject.getCode());
    }
}
