import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int n = randomNumber.nextInt((151)+5);
        if (n > 24 & n < 101) {
            System.out.println("Рандомное число попало в диапазон от 25 до 100, n = " + n);
        } else {
            System.out.println("Рандомное число не попало в диапазон от 25 до 100, n = " + n);
        }
    }
}