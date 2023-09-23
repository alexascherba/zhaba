import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.nameStudent = "Ivan";
        ivanov.numberCourse = 3;
        System.out.println("Имя - " + ivanov.nameStudent + ", Курс - " + ivanov.numberCourse + ", средний балл - " + ivanov.average());
    }
}