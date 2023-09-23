public class Animals {
    public String name;
    public int age, weight, height;
    final int FINAL_AGE = 10, FINAL_WEIGHT = 50, FINAL_HEIGHT = 150;

    public Animals () {
        name = "-";
        age = 0;
        weight = 0;
        height = 0;
    }
    public Animals (String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public void show() {
        System.out.println("Name: " + name + ", age: " + age + ", weight: " + weight + ", height: " + height);
    }
    public static void hasSameName (String firstName, String secondName) {
        if (firstName.equals(secondName)) {
            System.out.println("The names are the same.");
        } else {
            System.out.println("The names are not the same.");
        }
    }
    public void compare () {
        System.out.println("The name of the animal is " + name);
        if (age > FINAL_AGE) {
            System.out.print("Over " + FINAL_AGE + " years old.");
        } else {
            System.out.print("Under " + FINAL_AGE + " years old.");
        }
        if (height > FINAL_HEIGHT) {
            System.out.print(" Over " + FINAL_HEIGHT + " cm.");
        } else {
            System.out.print(" Under " + FINAL_HEIGHT + " cm.");
        }
        if (weight > FINAL_WEIGHT) {
            System.out.println(" Heavier  than " + FINAL_HEIGHT + " kg.");
        } else {
            System.out.println(" Lighter than " + FINAL_HEIGHT + " kg.");
        }
    }

}
