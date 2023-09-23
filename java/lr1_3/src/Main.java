import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 0, sum = 0;
        Scanner sr = new Scanner(System.in);
        System.out.println("Введите номер десятка: ");
        if (sr.hasNextInt()) {
            n = sr.nextInt();
        }
        do {
            if (n > 0 & n < 5) {
                System.out.println("Вы ввели " + n);
            } else {
                System.out.println("Введите число от 1 до 4");
                if (sr.hasNextInt()) {
                    n = sr.nextInt();
                }
            }
        } while (n < 1 || n > 4);
        for (int i = 1; i <= n; i++) {
            int degree = (int) Math.pow(10, i);
            sum += degree * (degree - 1) / 2;
        }
        System.out.println(sum);
    }
}