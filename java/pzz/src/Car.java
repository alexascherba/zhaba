import  java.util.Scanner;
public class Car {
    public int speed;
    public String color;
    public Car (Car ob) {
        this.speed = ob.speed;
        this.color = ob.color;
    }
    public Car (int speed, String color) {
        this.color = color;
        this.speed = speed;
    }
    public Car() {
    }
    public  void create () {
        System.out.println("Enter speed");
        Scanner sr = new Scanner(System.in);
        if (sr.hasNextInt()) {
            speed = sr.nextInt();
        }
        System.out.println("Enter color");
        sr = new Scanner(System.in); //ссылка на объект  = .....
        if (sr.hasNextLine()) {
            color = sr.nextLine();
        }
    }
    public  void show () {
        System.out.println(speed + color);
    }
    public double time (double length) {
        return length / speed;
    }
    public static  Car[] createMas(int n) {
        Car mas[] = new Car[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Car();
            mas[i].create();
        }
        return mas;
    }
    public static void showMas (Car[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }
    public static Car bestCar(Car[] mas) {
        Car best = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i].speed > best.speed) {
                best = mas[i];
            }
        }
        return best;
    }
}
