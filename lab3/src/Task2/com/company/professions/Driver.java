package Task2.com.company.professions;

public class Driver extends Person{
    private int experience;
    public Driver(String fullName, int age, int experience){
        super(fullName, age);
        this.experience = experience;
    }
    public String toString() {
        return super.toString() + ", стаж " + experience;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
}
