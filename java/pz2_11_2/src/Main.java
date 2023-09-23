import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter 1 value for matrix n*1");
        int numRows = 0, numCols = 0;
        if (sr.hasNextInt()) {
            numRows = sr.nextInt();
        }
        Matrix m1 = new Matrix(numRows);
        m1.setMatrix();
        m1.show();
        System.out.println("Enter 2 value for matrix n*m");
        if (sr.hasNextInt()) {
            numRows = sr.nextInt();
            numCols = sr.nextInt();
        }
        Matrix m2 = new Matrix(numRows, numCols);
        m2.setMatrix();
        m2.show();
        System.out.println("Enter 2 value for matrix n*m");
        if (sr.hasNextInt()) {
            numRows = sr.nextInt();
            numCols = sr.nextInt();
        }
        Matrix m3 = new Matrix(numRows, numCols);
        m3.setMatrix();
        m3.show();
        Matrix.sum(m2, m3);
        Matrix.difference(m2, m3);
        Matrix.multiply(m2, m3);
    }
}