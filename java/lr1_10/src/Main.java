import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomSec = new Random();
        int n = randomSec.nextInt(28801);
        System.out.println("Осталось " + n + " секунд");
        int i = n/3600;
        if (i < 1) {
            System.out.println("Осталось менее часа");
        } else {
            System.out.println("Осталось " + i + " часов");
        }

    }
}