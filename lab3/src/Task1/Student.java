package Task1;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private  double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
        this.group = group;
    }
    public double getAverageMark() { return averageMark; }
    public String getFirstName() { return firstName; }
    public String getGroup() { return group; }
    public String getLastName() { return lastName; }
    public void setAverageMark(double averageMark) { this.averageMark = averageMark; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setGroup(String group) { this.group = group; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    int getScholarship(){
        if (averageMark >= 5) {
            if (averageMark >= 8) {
                return 100;
            } else {
                return 80;
            }
        } else return 0;
    }
    public static void showMas(Student[] mas){
        System.out.println("The students you entered are: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }
    public void show() {
        System.out.println("First name - " + getFirstName() + ", last name - " + getLastName() + ", group - " + getGroup());
        System.out.println("Average mark = " + getAverageMark());
    }
}
