public class Main {
    public static void main(String[] args) {
        Car mas[] = Car.createMas(3);
        Car.showMas(mas);
        Car best = Car.bestCar(mas);
        System.out.println("Параметры самого быстрого автомобиля:");
        best.show();
    }
}