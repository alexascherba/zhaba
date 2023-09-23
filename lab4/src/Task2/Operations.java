package Task2;

import java.util.ArrayList;


public class Operations {
    private static ArrayList<Number> numbers;

    Operations(ArrayList<Number> numbers) {
        this.numbers = numbers;
    }
    public static void addNumber(Number num) {
        numbers.add(num);
    }
    public static void deleteNumber(Number num) {
        numbers.remove(num);
    }
    public void print() {
        numbers.forEach(number -> System.out.print((number) + " "));
    }
    public static void searchNearest(Number num) {
        Number closestNumber = numbers.get(0);
        double minDifference = Math.abs(num.doubleValue() - closestNumber.doubleValue());
        numbers.remove(num);

        for (Number number : numbers) {
            double difference = Math.abs(num.doubleValue() - number.doubleValue());
            if (difference <= minDifference) {
                minDifference = difference;
                closestNumber = number;
            }
        }
        System.out.println("Ближайшее число к " + num + " - " + closestNumber );
    }
    public static ArrayList<Number> getNumbers() {
        return numbers;
    }
}
