import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Misha", "2363123", 3, List.of(5, 8, 2)));
        students.add(new Student("Masha", "23633", 1, List.of(5, 8, 9)));
        students.add(new Student("Roma", "2363123", 2, List.of(9, 8, 2)));

    }
}