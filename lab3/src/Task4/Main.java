package Task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество изданий в каталоге ");
        try{
            int n = sc.nextInt();
            Printable[] mas = new Printable[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Выберите тип издания 1 - журнал, 2 - книга ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Введите название журнала");
                        String name1 = sc.nextLine();
                        mas[i] = new Magazine(name1);
                    }
                    case 2 -> {
                        System.out.println("Введите название книги");
                        String name2 = sc.nextLine();
                        mas[i] = new Book(name2);
                    }
                    default -> {
                        System.out.println("Неправильный ввод");
                        return;
                    }
                }
            }
            System.out.println("Каталог ");
            for (Printable x : mas) {
                x.print();
            }
            System.out.println("Только книги: ");
            Book.printBooks(mas);
            System.out.println("Только журналы: ");
            Magazine.printMagazines(mas);
        } catch(InputMismatchException e){ //несоответствие типа, вводимого значение
            System.out.println("Неправильный ввод");
        }
    }
}
