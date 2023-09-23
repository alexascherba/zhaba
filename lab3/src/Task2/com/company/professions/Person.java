package Task2.com.company.professions;

public class Person {
    private int age;
    private String fullName;
    public Person (String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public String toString() {
        return "Водитель: " + "\n Полное имя " + fullName + ", возраст " + age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
