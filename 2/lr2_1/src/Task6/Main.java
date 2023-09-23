package Task6;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("\nInput string: ");
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        }
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Last character: " + lastChar);
        if (str.endsWith("!!!")) {
            System.out.println("Str ends with !!!");
        } else System.out.println("Str doesn't end with !!!");
        if (str.startsWith("I like")) {
            System.out.println("Str starts with I like");
        } else System.out.println("Str doesn't start with I like");
        if (str.contains("Java")) {
            System.out.println("Str contains Java");
        } else System.out.println("Str doesn't contain Java");
        int javaIndex = str.indexOf("Java");
        System.out.println("Index of 'Java': " + javaIndex);
        String replacedStr = str.replace('a', 'o');
        System.out.println("Replaced string: " + replacedStr);
        String upperCaseStr = str.toUpperCase();
        System.out.println("Upper case string: " + upperCaseStr);
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lower case string: " + lowerCaseStr);
        String cutStr = str.substring(7, 11);
        System.out.println("Cut string: " + cutStr);

    }
}
