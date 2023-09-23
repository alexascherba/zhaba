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
        System.out.println("Length of strings:");
        for (int i = 0; i < n; i++) {
            int a = array[i].length();
            System.out.println(a + " ");
        }

    }

}
