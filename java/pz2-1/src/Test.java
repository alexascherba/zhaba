import java.util.Scanner;

public class Test {
    public static void inputArray () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of the array: ");
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        sc.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String input = null;
            if (sc.hasNextLine()) {
                input = sc.nextLine();
            }
            array[i] = input;
        }
        System.out.println("Array of strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (countWords(array[j]) > countWords(array[j+1])) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted rows:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

    }
    private static int countWords(String string) {
        return string.trim().split("[\\s,\\.]+").length;
    }
}
