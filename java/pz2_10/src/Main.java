import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = null;
        if (sr.hasNextLine()) {
            name = sr.nextLine();
        }
        System.out.print("Enter course number: ");
        int courseNumber = 0;
        if (sr.hasNextInt()) {
            courseNumber = sr.nextInt();
        }
        Student student = new Student(name, courseNumber);
        Student studentCopy = new Student(student);
        System.out.println("Student: " + student.name + " (Course: " + student.courseNumber + ")");
        System.out.println("Student copy: " + studentCopy.name + " (Course: " + studentCopy.courseNumber + ")");
    }
}