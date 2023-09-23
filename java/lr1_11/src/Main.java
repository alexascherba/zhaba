import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[12];
        Random randomNumbers = new Random();
        for (int i = 0; i < 12; i++) {
            arr[i] = randomNumbers.nextInt(31)-15;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = arr[0];
        int lastIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                lastIndex = i;
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс последнего вхождения: " + lastIndex);
        System.out.println("Номер последнего вхождения: " + (lastIndex + 1));
    }
}