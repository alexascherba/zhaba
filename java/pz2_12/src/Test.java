import java.util.Scanner;

public class Test {
    public static void show(int... arg) {
        System.out.println("Objects: ");
        for (int x : arg) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void sum(int... arg ){
        int sum = 0;
        for(int x : arg){
            sum += x;
        }
        System.out.println("Sum of the objects: " + sum);
    }
    public static void increase(int... arg ){
        int increase = 1;
        for(int x : arg){
            increase *= x;
        }
        System.out.println("Increase of the objects: " + increase);
    }
    public static void sortAscending(int... arg) {
        int temp;
        for (int i = 0; i < arg.length; i++) {
            for (int j = i + 1; j < arg.length; j++) {
                if (arg[i] > arg[j]) {
                    temp = arg[i];
                    arg[i] = arg[j];
                    arg[j] = temp;
                }
            }
        }
        System.out.println("Objects with sort: ");
        for (int num : arg) {
            System.out.print(num + " ");
        }
    }
}
