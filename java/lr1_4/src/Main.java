import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = random.nextInt(10) + 1;
        int n = 0;
        System.out.println("Угадайте число от 1 до 10");
        do {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }
            if (n > randomNumber) {
                System.out.println("Загаданное число меньше, попробуйте ещё раз");
            } else if (n < randomNumber) {
                System.out.println("Загаданное число больше, попробуйте ещё раз");
            } else {
                System.out.println("Поздравляю, вы угадали число!");
            }
        } while (randomNumber != n);
    }
}