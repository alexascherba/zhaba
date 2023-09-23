package Task4;

import java.io.Serializable;

public class Animal implements Serializable {
    private double weight;
    private double height;

    Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public String toString() {
        return "Вес: " + weight + "\nРост: " + height;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}