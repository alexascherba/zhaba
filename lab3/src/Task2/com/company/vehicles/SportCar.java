package Task2.com.company.vehicles;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class SportCar extends Car{
    private int speed;
    public SportCar (String model, String carClass, int weight, Driver driver, Engine engine, int speed){
        super(model, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public String toString() {
        return super.toString() + ", скорость " + speed;
    }

    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    public void setCarClass(String carClass) {
        super.setCarClass(carClass);
    }

    public String getCarClass() {
        return super.getCarClass();
    }

    public void setModel(String model) {
        super.setModel(model);
    }

    public Engine getEngine() {
        return super.getEngine();
    }

    public Driver getDriver() {
        return super.getDriver();
    }

    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    public void setDriver(Driver driver) {
        super.setDriver(driver);
    }

    public String getModel() {
        return super.getModel();
    }

    public int getWeight() {
        return super.getWeight();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
