import java.util.Scanner;

public class Student {
    int numberCourse;
    String nameStudent;
    public int average() {
        int numberMarks = 0;
        Scanner sr = new Scanner(System.in);
        System.out.println("Введите количество отметок");
        if (sr.hasNextInt()) {
            numberMarks = sr.nextInt();
        }
        int arr[] = new int[numberMarks];
        System.out.println("Введите отметки");
        for (int i = 0; i < numberMarks; i++) {
            if (sr.hasNextInt()) {
                arr[i] = sr.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < numberMarks; i++) {
            sum += arr[i];
        }
        return sum/numberMarks;
    }

}