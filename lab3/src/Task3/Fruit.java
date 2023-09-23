package Task3;

public abstract class Fruit {
    private double weight;
    public void printManufacturerInfo(){
        System.out.print("Made in RB");
    }
    public abstract double price(double weight);
}
