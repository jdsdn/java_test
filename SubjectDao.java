import java.util.List;

public interface SubjectDao {
   public List<Subject> getAllSubjects();
   public Subject getSubject(int code);
   public void addSubject(Subject Subject);
   public void updateSubject(Subject Subject);
   public void deleteSubject(Subject Subject);
}