import java.util.Scanner;

public class Student {
    int numberCourse;
    String nameStudent;
    public Student(int numberCourse, String nameStudent) {
        this.numberCourse = numberCourse;
        this.nameStudent = nameStudent;
    }
    public void show() {
        System.out.println("Имя - " + nameStudent + ", Курс - " + numberCourse);
    }
}