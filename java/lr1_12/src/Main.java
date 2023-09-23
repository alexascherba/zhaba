import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Введите натуральное число больше 3");
        do {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }
            if (n <= 3) {
                System.out.println("Попробуйте ещё раз! Введите натуральное число больше 3");
            }
        } while (n <= 3);
        int arr[] = new int[n];
        Random randomNumber = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = randomNumber.nextInt(n+1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int newArr[] = new int[n];
        int newIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 & arr[i] != 0) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        System.out.println("Массив с чётными элементами:");
        for (int i = 0; i < newIndex; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}