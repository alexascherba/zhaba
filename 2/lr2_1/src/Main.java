import Task1.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter number from 1 to 6!!");
        if (sr.hasNextInt()) {
            switch (sr.nextInt()) {
                case 1 -> Task1.Main.main();
                case 2 -> Task2.Main.main();
                case 3 -> Task3.Main.main();
                case 4 -> Task4.Main.main();
                case 5 -> Task5.Main.main();
                case 6 -> Task6.Main.main();
                default -> System.out.println("Try again(((");
            }
        }
    }
}