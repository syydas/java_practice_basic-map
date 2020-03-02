import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Teacher {

    private String name;
    private Map<Integer, List<Student>> student;

    public Teacher() {
    }

    public Teacher(String name, Map<Integer, List<Student>> student) {
        this.name = name;
        this.student = student;
    }

    public Map<Integer, List<Student>> getStudent() {
        return student;
    }

    public void addStudent(Student stu) {
        if (student.get(stu.getAge()) == null) {
            List<Student> newAge = new ArrayList<>();
            newAge.add(stu);
            student.put(stu.getAge(), newAge);
        } else {
            student.get(stu.getAge()).add(stu);
        }
    }
}
