package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = null, lastName = null, group = null;
        double averageMark = 0;
        int scienceWork = 0;

        System.out.print("First name: ");
        if (sc.hasNextLine()) {
            firstName = sc.nextLine();
        } else System.out.println("Wrong input!");
        System.out.print("Last name: ");
        if (sc.hasNextLine()) {
            lastName = sc.nextLine();
        } else System.out.println("Wrong input!");
        System.out.print("Group: ");
        if (sc.hasNextLine()) {
            group = sc.nextLine();
        } else System.out.println("Wrong input!");
        System.out.print("Average mark: ");
        if (sc.hasNextDouble()){
            averageMark = sc.nextDouble();
        } else System.out.println("Wrong input!");
        System.out.print("How many science works do you have? ");
        if (sc.hasNextInt()){
            scienceWork = sc.nextInt();
        } else System.out.println("Wrong input!");

        Student magistrate = new Magistracy(firstName, lastName, group, averageMark, scienceWork);
        System.out.println("Scholarship is " + magistrate.getScholarship() + "BYN");

        Student[] students = new Student[3];
        students[0] = new Student("Anastasia","Alexandrova","163101", 8);
        students[1] = new Magistracy("Masha","Klimova","163001", 7.8,1);
        students[2] = new Student("Roma", "Levchuk", "163001", 7);

        for (int i = 0; i < students.length; i++) {
            students[i].show();
            System.out.println(students[i].getScholarship() + "BYN");
        }
    }
}
