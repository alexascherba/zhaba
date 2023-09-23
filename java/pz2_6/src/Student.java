import java.util.Scanner;

public class Student {
    int numberCourse;
    String nameStudent;
    public Student() {
        numberCourse = 2;
        nameStudent = "Петр";
    }

    public void show() {
        System.out.println("Имя - " + nameStudent + ", Курс - " + numberCourse);
    }
}