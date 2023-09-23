import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0, k = 1, counter = 4;
        Scanner sr = new Scanner(System.in);
        System.out.println("Введите число:");
        if (sr.hasNextInt()) {
            a = sr.nextInt();
        }
        else System.out.println("Введите число типа int!");
        do {
            System.out.println(a + " в " + k + " степени = " + (int)Math.pow(a, k));
            k++;
        } while (--counter > 0);
    }
}