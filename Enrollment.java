import java.util.Scanner; 

public class Enrollment {
    static ClassDao classDao;
    static TeacherDao teacherDao;
    static StudentDao studentDao;
    static SubjectDao subjectDao;
    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // set default data
        setInitialData();

        int c = -1;

        while(c != 0) {
            System.out.println("1. Subjects \n2. Students \n3. Teachers \n4. Classes \n5. Add Class \n6. Enroll Student \n7. Update Class Teacher \n8. Update Class Subject \n0: exit \n");

            c = scan.nextInt();
            scan.nextLine();

            switch(c) {
                case 1: showSubjects(); break;
                case 2: showStudents(); break;
                case 3: showTeachers(); break;
                case 4: showClasses(true); break;
                case 5: AddClass(); break;
                case 6: AddStudenttoClass(); break;
                case 7: UpdateTeacher(); break;
                case 8: UpdateSubject(); break;
                default: continue;
            }
        }

        scan.close();
    }

    public static void UpdateSubject() {
        if(classDao.getSize() <= 0) {
            System.out.println("Classlist Empty");
            return;
        }

        showClasses(false);
        System.out.println("Enter class code: ");
        int cid = scan.nextInt();

        showSubjects();
        System.out.println("\nEnter subject id: ");
        int sid = scan.nextInt();

        Class cls = classDao.getClass(cid);
        classDao.updateClassSubject(cls, subjectDao.getSubject(sid));
    }

    public static void UpdateTeacher() {
        if(classDao.getSize() <= 0) {
            System.out.println("Classlist Empty");
            return;
        }

        showClasses(false);
        System.out.println("Enter class code: ");
        int cid = scan.nextInt();

        showTeachers();
        System.out.println("\nEnter teacher id: ");
        int tid = scan.nextInt();

        Class cls = classDao.getClass(cid);
        classDao.updateClassTeacher(cls, teacherDao.getTeacher(tid));
    }

    public static void AddStudenttoClass() {
        if(classDao.getSize() <= 0) {
            System.out.println("Classlist Empty");
            return;
        }

        showClasses(false);
        System.out.println("Enter class code: ");
        int cid = scan.nextInt();

        Class cls = classDao.getClass(cid);
        showStudents();
        System.out.println("Enter student id: ");
        int sid = scan.nextInt();

        cls.addStudent(studentDao.getStudent(sid));
        showClasses(false);
    }

    public static void AddClass() {
        System.out.println("Enter class name: ");
        String cname = scan.nextLine();
        System.out.println("Enter class time: ");
        String ctime = scan.nextLine();
        showTeachers();
        System.out.println("\nEnter teacher id: ");
        int cid = scan.nextInt();
        showSubjects();
        System.out.println("\nEnter subject id: ");
        int sid = scan.nextInt();


        Class Class = new Class((classDao.getSize() - 1) + 1, cname, ctime, subjectDao.getSubject(sid), teacherDao.getTeacher(cid));
        classDao.addClass(Class);

        System.out.println("\nClass Added.");
    }

    public static void showClasses(boolean hasst) {
        System.out.println("");
        for (Class Class : classDao.getAllClasses()) {
            System.out.println("Class: [Code : " + Class.getCode() 
            + ", Name : " + Class.getName()
            + ", Subject : " + Class.getSubject().getName()
            + ", Teacher : " + Class.getTeacher().getUser().getFullname()
            + " ]");

            if(hasst == true) {
                for(Student Student : classDao.getAllStudents(Class.getCode())) {
                    System.out.println("Student: [Id : " + Student.getId() 
                    + ", Course : " + Student.getCourse() 
                    + ", Year : " + Student.getYear() 
                    + ", Firstname : " + Student.getUser().getFname() 
                    + ", Lastname : " + Student.getUser().getLname() 
                    + ", Gender : " + Student.getUser().getGender() 
                    + ", Age : " + Student.getUser().getAge() 
                    + " ]");
                }
            }
        }

        System.out.println("");
    }

    public static void showSubjects() {
        for (Subject Subject : subjectDao.getAllSubjects()) {
           System.out.println("Subject: [Code : " + Subject.getCode() 
           + ", Name : " + Subject.getName()
           + " ]");
        }

        System.out.println("");
    }

    public static void showStudents() {
        for (Student Student : studentDao.getAllStudents()) {
            System.out.println("Student: [Id : " + Student.getId() 
            + ", Course : " + Student.getCourse() 
            + ", Year : " + Student.getYear() 
            + ", Firstname : " + Student.getUser().getFname() 
            + ", Lastname : " + Student.getUser().getLname() 
            + ", Gender : " + Student.getUser().getGender() 
            + ", Age : " + Student.getUser().getAge() 
            + " ]");
        }

        System.out.println("");
    }

    public static void showTeachers() {
        for (Teacher Teacher : teacherDao.getAllTeachers()) {
            System.out.println("Teacher: [Id : " + Teacher.getId()
            + ", Position : " + Teacher.getPosition() 
            + ", Firstname : " + Teacher.getUser().getFname() 
            + ", Lastname : " + Teacher.getUser().getLname() 
            + ", Gender : " + Teacher.getUser().getGender() 
            + ", Age : " + Teacher.getUser().getAge() 
            + " ]");
        }

        System.out.println("");
    }

    public static void setInitialData() {
        classDao = new ClassDaoImp();
        studentDao = new StudentDaoImp();
        teacherDao = new TeacherDaoImp();
        subjectDao = new Subjectdaoimp();

        // users
        User u1 = new User(15, "One", "esama", "Female");
        User u2 = new User(16, "Two", "two world", "Male");
        User u3 = new User(15, "Three", "ftw", "Gmail");
        User u4 = new User(15, "III", "TTT", "Female");
        User u5 = new User(16, "CCC", "SSS", "Male");
        User u6 = new User(15, "PPP", "RRR", "Gmail");

        // student
        Student s1 = new Student(0, "BSIT", 1, u1);
        Student s2 = new Student(1, "BSCS", 1, u2);
        Student s3 = new Student(2, "BSLIS", 1, u3);

        studentDao.addStudent(s1);
        studentDao.addStudent(s2);
        studentDao.addStudent(s3);

        // teachers
        Teacher t1 = new Teacher(0, "IT Professor", u4);
        Teacher t2 = new Teacher(1, "CS Professor", u5);
        Teacher t3 = new Teacher(2, "Professor", u6);

        teacherDao.addTeacher(t1);
        teacherDao.addTeacher(t2);
        teacherDao.addTeacher(t3);

        // subjects
        Subject sj1 = new Subject(0, "Programming 1");
        Subject sj2 = new Subject(1, "Programming 2");
        Subject sj3 = new Subject(2, "Programming 3");

        subjectDao.addSubject(sj1);
        subjectDao.addSubject(sj2);
        subjectDao.addSubject(sj3);
    }
}
