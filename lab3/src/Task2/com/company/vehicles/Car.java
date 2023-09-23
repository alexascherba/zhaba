package Task2.com.company.vehicles;


import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class Car {
    private String model;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;
    public Car(String model, String carClass, int weight, Driver driver, Engine engine){
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public String toString() {
        return "Автомобиль " + model + " класса " + carClass + "\n" + driver.toString() + engine.toString();
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getCarClass() {
        return carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getModel() {
        return model;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
