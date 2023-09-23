package Task2.com.company.vehicles;
import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;
    public Lorry (String model, String carClass, int weight, Driver driver, Engine engine, int carrying){
        super(model, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public String toString() {
        return super.toString() + ", грузоподъемность " + carrying;
    }

    public Driver getDriver() {
        return super.getDriver();
    }

    public Engine getEngine() {
        return super.getEngine();
    }

    public int getWeight() {
        return super.getWeight();
    }

    public String getCarClass() {
        return super.getCarClass();
    }

    public String getModel() {
        return super.getModel();
    }

    public void setCarClass(String carClass) {
        super.setCarClass(carClass);
    }

    public void setDriver(Driver driver) {
        super.setDriver(driver);
    }

    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    public void setModel(String model) {
        super.setModel(model);
    }

    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
