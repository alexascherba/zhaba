package Task5;

public class Main {
    public static void main() {
        Double doubleObj = Double.valueOf(9.99);

        String stringToDouble = "7.54";
        double doubleFromString = Double.parseDouble(stringToDouble);

        byte byteValue = doubleObj.byteValue();
        short shortValue = doubleObj.shortValue();
        int intValue = doubleObj.intValue();
        long longValue = doubleObj.longValue();
        float floatValue = doubleObj.floatValue();

        System.out.println("Double object value: " + doubleObj);

        String doubleLiteralStr = Double.toString(3.14);
        System.out.println("Double literal as a string: " + doubleLiteralStr);
    }
}
