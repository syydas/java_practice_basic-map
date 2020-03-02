import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Student linda = new Student("Linda", 18);
        Student cindy = new Student("Cindy", 19);
        Student mary = new Student("Mary", 19);

        List<Student> age18 = new ArrayList<>();
        List<Student> age19 = new ArrayList<>();
        age18.add(linda);
        age19.add(cindy);
        age19.add(mary);

        Map<Integer, List<Student>> students = new HashMap<>();
        students.put(18, age18);
        students.put(19, age19);

        Teacher teacher = new Teacher("Bob", students);
        teacher.addStudent(new Student("Ben", 19));
        teacher.addStudent(new Student("Solider", 20));

        System.out.println(teacher.getStudent());
    }

}
