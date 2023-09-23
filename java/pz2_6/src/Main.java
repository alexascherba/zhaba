import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.show();
        Student ivanova = new Student();
        ivanova.nameStudent = "Masha";
        ivanova.numberCourse = 4;
        ivanova.show();
    }
}