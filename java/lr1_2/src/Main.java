import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int password = 0, input = 0;
        System.out.print("Введите пароль: ");
        if (sr.hasNextInt()) {
            password = sr.nextInt();
        } else {
            System.out.println("Введите число типа int!");
        }
        do {
            System.out.print("Повторите пароль: ");
            if (sr.hasNextInt()) {
                input = sr.nextInt();
            } else {
                System.out.println("Введите число типа int!");
            }
        } while (input != password);
        System.out.println("Верно!");
    }
}