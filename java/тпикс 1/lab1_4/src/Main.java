import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        a = (int) (Math.random() * (10 - 1 + 1) + 1);
        Scanner in = new Scanner(System.in);
        System.out.print("Попробуйте угадать число из диапазона от 1 до 10: ");
        if (in.hasNextInt()) {
            do {
                b = in.nextInt();
                if (b == a) {
                    System.out.println("Вы угадали");
                } else {
                    if (b > 0 && b <= 10) {
                        System.out.print("Вы не угадали. ");
                        if (a < b) {
                            System.out.println("Число меньше");
                        } else {
                            System.out.println("Число больше");
                        }
                    } else {
                            System.out.println("Число не соответсвует диапазону");
                        }
                    }
                } while( b != a );
            } else {
                System.out.println(" Ошибка, число не целое");
            }
        }
    }