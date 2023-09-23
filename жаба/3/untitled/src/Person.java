public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(String data) {
        String[] fields = data.split(";");
        this.name = fields[0].trim();
        this.age = Integer.parseInt(fields[1].trim());
        this.weight = Integer.parseInt(fields[2].trim());
        this.height = Integer.parseInt(fields[3].trim());
    }

    public void compare(String data) {
        String[] fields = data.split(";");
        String name = fields[0].trim();
        int age = Integer.parseInt(fields[1].trim());
        int weight = Integer.parseInt(fields[2].trim());
        int height = Integer.parseInt(fields[3].trim());
        if (this.name.equals(name) && this.age == age && this.weight == weight && this.height == height) {
            System.out.println("The same person");
        } else {
            System.out.println("Different people");
        }

    }

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
    }
}
