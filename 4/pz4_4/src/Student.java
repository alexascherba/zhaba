import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;
    public Student(String name, String group, int course, List<Integer> grades) {
        this.course = course;
        this.grades = grades;
        this.name = name;
        this.group = group;
    }
    public double getAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum/grades.size();
    }
    public String getName() {return name;}
    public int getCourse() {return course;}
}
