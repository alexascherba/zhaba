import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов:");
        if (sc1.hasNextInt()&&sc2.hasNextInt()) {
            int N = sc1.nextInt();
            int M = sc2.nextInt();
            int mas[][] = new int[N][M];
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = (int)(Math.random() * 16+5);
                    System.out.print(mas[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            int min_ind = 0;
            int max_ind = 0;
            for (int i = 0; i < mas.length; i++) {
                int min = mas[i][0];
                int max = mas[i][0];
                for (int j = 1; j < mas[i].length; j++) {
                    if (mas[i][j] <= min) {
                        min = mas[i][j];
                        min_ind = j;
                    }
                    if (mas[i][j] >= max) {
                        max = mas[i][j];
                        max_ind = j;
                    }
                }
                mas[i][min_ind] = mas[i][mas[i].length - 1];
                mas[i][mas[i].length - 1] = min;
                mas[i][max_ind] = mas[i][0];
                mas[i][0] = max;
            }
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.print(mas[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Неккоректное число");
        }
    }
}