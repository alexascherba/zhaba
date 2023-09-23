package Task2.com.company.details;

public class Engine {
    private int power;
    private String company;
    public Engine(int power, String company){
        this.company = company;
        this.power = power;
    }

    public String toString() {
        return "\nДвигатель:" + "\n мощность " + power + ", страна производитель " + company;
    }

    public int getPower() { return power; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public void setPower(int power) { this.power = power; }
}
