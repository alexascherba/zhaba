package Task4;

public class Horse extends Animal {
    private String breed;
    private double speed;

    public Horse(double weight, double height, String breed, double speed) {
        super(weight, height);
        this.breed = breed;
        this.speed = speed;
    }

    public String toString() {
        return "Вес: " + getWeight() + "\nРост: " + getHeight() + "\nПорода: " + getBreed() + "\nСкорость: " + getSpeed();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    public double getSpeed() {
        return speed;
    }
}
