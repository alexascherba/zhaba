import java.util.Scanner;

public abstract class Animals {
    private double weight;
    private int age;
    private String name;
    public Animals(String n, double w, int a) {
        name = n;
        weight = w;
        age = a;
    }
    public Animals(Animals ob) {
        name = ob.name;
        weight = ob.weight;
        age = ob.age;
    }
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    void show() {
        System.out.println("Name of the animal is " + getName() + ", age is " + getAge() + ", weight is " + getWeight());
    }
    public abstract void voice();

}
