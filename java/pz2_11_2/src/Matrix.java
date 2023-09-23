import java.util.Scanner;
public class Matrix {
    public int[][] arr;
    public int numRows;
    public int numCols;
    public Matrix () {}
    public Matrix(int numRows) {
        this.numRows = numRows;
        this.numCols = 1;
        this.arr = new int[numRows][numCols];
    }
    public Matrix(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.arr = new int[numRows][numCols];
    }

    public void setMatrix () {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.printf("Element  " + i + " " + j );
                if (sr.hasNextInt()) {
                    arr[i][j] = sr.nextInt();
                }
            }
        }

    }
    public void show() {
        System.out.println("Matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sum (Matrix a, Matrix b) {
        if (a.numRows != b.numRows || a.numCols != b.numCols) {
            System.out.println("It is not possible to add matrices of different sizes.");
        } else {
            Matrix result = new Matrix(a.numRows, a.numCols);
            for (int i = 0; i < a.numRows; i++) {
                for (int j = 0; j < a.numCols; j++) {
                    result.arr[i][j] = a.arr[i][j] + b.arr[i][j];
                }
            }
            System.out.println("Matrix sum:");
            for (int i = 0; i < a.numRows; i++) {
                for (int j = 0; j < a.numCols; j++) {
                    System.out.print(result.arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void difference (Matrix a, Matrix b) {
        if (a.numRows != b.numRows || a.numCols != b.numCols) {
            System.out.println("It is not possible to add matrices of different sizes.");
        } else {
            Matrix resultD = new Matrix(a.numRows, a.numCols);
            for (int i = 0; i < a.numRows; i++) {
                for (int j = 0; j < a.numCols; j++) {
                    resultD.arr[i][j] = a.arr[i][j] - b.arr[i][j];
                }
            }
            System.out.println("Matrix difference:");
            for (int i = 0; i < a.numRows; i++) {
                for (int j = 0; j < a.numCols; j++) {
                    System.out.print(resultD.arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void multiply (Matrix a, Matrix b) {
        if (a.numCols != b.numRows) {
            System.out.println("The number of columns in the first matrix must match the number of rows in the second matrix.");
        } else {
            Matrix resultM = new Matrix(a.numRows, b.numCols);
            for (int i = 0; i < a.numRows; i++) {
                for (int j = 0; j < b.numCols; j++) {
                    int sumMultiply = 0;
                    for (int k = 0; k < a.numCols; k++) {
                        sumMultiply += a.arr[i][k] * b.arr[k][j];
                    }
                    resultM.arr[i][j] = sumMultiply;
                }
            }
            System.out.println("Matrix multiply:");
            for (int i = 0; i < a.numRows; i++) {
                for (int j = 0; j < a.numCols; j++) {
                    System.out.print(resultM.arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}