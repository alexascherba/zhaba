package Task2.com.company;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;
import Task2.com.company.vehicles.Car;
import Task2.com.company.vehicles.Lorry;
import Task2.com.company.vehicles.SportCar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = null;
        int age = 0, experience = 0;
        try {
            System.out.println("Водительская характеристика ");
            System.out.print("ФИО ");
            if (sc.hasNextLine()) fullName = sc.nextLine();
            System.out.print("Возраст ");
            if (sc.hasNextInt()) age = sc.nextInt();
            System.out.print("Водительский стаж ");
            if (sc.hasNextInt()) experience = sc.nextInt();
            Driver driver = new Driver(fullName, age, experience);
            System.out.println("Выберите тип автомобиля");
            System.out.println("1 - машина | 2 - грузовик | 3 - спорткар");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("Модель ");
                    String model = sc.next();
                    System.out.print("Класс автомобиля ");
                    String carClass = sc.next();
                    System.out.print("Вес ");
                    int weight = sc.nextInt();
                    System.out.print("Мощность двигателя ");
                    int power = sc.nextInt();
                    System.out.print("Страна производства ");
                    String country = sc.next();
                    Engine engine = new Engine(power, country);
                    Car car = new Car(model, carClass, weight, driver, engine);
                    System.out.println(car);
                }
                case 2 -> {
                    System.out.print("Модель ");
                    String model1 = sc.next();
                    System.out.print("Класс автомобиля ");
                    String carClass1 = sc.next();
                    System.out.print("Вес ");
                    int weight1 = sc.nextInt();
                    System.out.print("Грузоподъемность ");
                    int carrying = sc.nextInt();
                    System.out.print("Мощность двигателя ");
                    int power1 = sc.nextInt();
                    System.out.print("Страна производства ");
                    String country1 = sc.next();
                    Engine engine1 = new Engine(power1, country1);
                    Car lorry = new Lorry(model1, carClass1, weight1, driver, engine1, carrying);
                    System.out.println(lorry);
                }
                case 3 -> {
                    System.out.print("Модель ");
                    String model2 = sc.next();
                    System.out.print("Класс автомобиля ");
                    String carClass2 = sc.next();
                    System.out.print("Вес ");
                    int weight2 = sc.nextInt();
                    System.out.print("Максимальная скорость ");
                    int speed = sc.nextInt();
                    System.out.print("Мощность двигателя ");
                    int power2 = sc.nextInt();
                    System.out.print("Страна производства ");
                    String country2 = sc.next();
                    Engine engine2 = new Engine(power2, country2);
                    Car sportcar = new SportCar(model2, carClass2, weight2, driver, engine2, speed);
                    System.out.println(sportcar);
                }
                default -> System.out.println("Вы ввели недоступную опцию.");
            }
        } catch (InputMismatchException e){
            System.out.println("Неккоректный ввод!");
        }
    }
}
