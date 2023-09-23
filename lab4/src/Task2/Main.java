package Task2;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Operations numbers = new Operations(new ArrayList<Number>());

        Operations.addNumber(1);
        Operations.addNumber(1.2);
        Operations.addNumber(9);
        Operations.addNumber(451);
        Operations.addNumber(23);
        Operations.addNumber(3);
        Operations.addNumber(2.2);
        numbers.print();
        System.out.println();

        System.out.println("------------------");

        Operations.deleteNumber(451);
        numbers.print();

        System.out.println();
        Operations.searchNearest(1.2);
        Operations.searchNearest(2.2);
    }
}
