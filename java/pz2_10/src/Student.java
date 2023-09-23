

public class Student {
    public String name;
    public int courseNumber;

    public Student(Student other) {
        this.name = other.name;
        this.courseNumber = other.courseNumber;
    }

    public Student(String name, int courseNumber) {
        this.name = name;
        this.courseNumber = courseNumber;
    }
}