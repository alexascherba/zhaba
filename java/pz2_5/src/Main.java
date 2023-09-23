import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.nameStudent = "Ivan";
        ivanov.numberCourse = 3;
        int numberMarks = 0;

        Scanner sr = new Scanner(System.in);
        System.out.println("Введите количество отметок");
        if (sr.hasNextInt()) {
            numberMarks = sr.nextInt();
        }
        int arr [] = new int [numberMarks];
        System.out.println("Введите отметки");
        for (int i = 0; i < numberMarks; i++) {
            if (sr.hasNextInt()) {
                arr[i] = sr.nextInt();
            }
        }
        System.out.println("Имя - " + ivanov.nameStudent + ", Курс - " + ivanov.numberCourse + ", средний балл - " + ivanov.average(arr));


    }
}