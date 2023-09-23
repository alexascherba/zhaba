import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 1) System.out.println(i + " - odd");
            else System.out.println(i + " - even");
            i += 1;
        }

        int counter = 10, a = 2;
        do {

            System.out.print(a + " ");
            a *= 2;

        } while (--counter > 0);

        System.out.println();
        int sum = 0;
        for (int b = -20; b <= 20; b++) {
            if (b % 2 == 0) sum += b;
        }
        System.out.println("Sum = " + sum);


        Scanner sc = new Scanner(System.in);
        int month = 1;
        System.out.println("Enter month number:");
        if (sc.hasNextInt()) do {
            month = sc.nextInt();
        } while (month < 1 || month > 12);
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }
    }
}