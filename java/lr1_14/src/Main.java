import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0, m = 0;
        System.out.println("Введите количество строк и столбцов матрицы:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            m = sc.nextInt();
        }

        Random randomNumber = new Random();
        int[][] mat = new int[n][m];
        System.out.println("Создана матрица А[" + n + "][" + m + "]");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = randomNumber.nextInt(100)-30;
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int max = mat[i][0], min = mat[i][0], max_i = 0, min_i = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                    max_i = j;
                }
                if (mat[i][j] < min) {
                    min = mat[i][j];
                    min_i = j;
                }
            }
            int temp = mat[i][0];
            if (temp == min) {
                min_i = max_i;
            }
            mat[i][0] = max;
            mat[i][max_i] = temp;
            temp = mat[i][m - 1];
            mat[i][m - 1] = min;
            mat[i][min_i] = temp;
        }
        System.out.println("Матрица после перестановки:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }
}