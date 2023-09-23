import java.util.Scanner;

public class Student {
    public int numberCourse;
    public String nameStudent;

    public int average(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }

}