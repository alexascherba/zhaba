package Task4;

public class Main {
    public static void main() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(7, 3);
        Fraction f3 = new Fraction(-1, 15);

        System.out.println("Sum of f1, f2, f3");
        f1.sum(f2, f3);
        f1.show();
        f1.reset(3, 5);
        System.out.println();

        System.out.println("Sum of f1, f2");
        f1.sum(f2);
        f1.show();
        f1.reset(3, 5);
        System.out.println();

        System.out.println("Difference of f1 and f2");
        f1.subtraction(f2);
        f1.show();
        f1.reset(3, 5);
        System.out.println();

        System.out.println("Difference of f1 and f3");
        f1.subtraction(f3);
        f1.show();
        f1.reset(3, 5);
        System.out.println();

        System.out.println("Multiplication of f1, f2, f3");
        f1.multiplication(f2, f3);
        f1.show();
        f1.reset(3, 5);
        System.out.println();

        System.out.println("Multiplication of f1, f2");
        f1.multiplication(f2);
        f1.show();
        f1.reset(3, 5);
        System.out.println();

        System.out.println("Division of f1 and f2");
        f1.division(f2);
        f1.show();
        f1.reset(3, 5);
        System.out.println();

        System.out.println("Division of f1 and f3");
        f1.division(f3);
        f1.show();
        f1.reset(3, 5);
        System.out.println();

        System.out.println("Array");
        int k = (int) ( 1 + Math.random()*10);
        Fraction[] arr = new Fraction[k];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Fraction();
            arr[i].reduction();
            System.out.print(arr[i].m + "/" + arr[i].n + "  ");
        }
        System.out.println();
        Fraction.mass(arr);
    }
}
