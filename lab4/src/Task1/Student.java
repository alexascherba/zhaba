package Task1;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String name;
    private int course;

    Student (String name, int course) {
        this.name = name;
        this.course = course;
    }
    Student(String name) {
        this.name = name;
    }
    public static ArrayList<Student> printStudents(ArrayList<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе -> ");
        ArrayList<Student> list = new ArrayList<>();
        for(Student student : students){
            if(student.course == course) {
                list.add(student);
            }
        }
        return list;
    }
    public String toString() {
        return "Name: " + getName() + " | " +
                "course: " + getCourse();
    }
    public static ArrayList<String> union(ArrayList<String> set1, ArrayList<String> set2) {
        ArrayList<String> unionList = new ArrayList<>(set1);
        unionList.addAll(set2);
        return unionList;
    }
    public static ArrayList<String> intersect(ArrayList<String> set1, ArrayList<String> set2) {
        ArrayList<String> intersectList = new ArrayList<>(set1);
        intersectList.retainAll(set2);
        return intersectList;
    }
    public static void printLists(ArrayList<String> list){
        list.forEach(student -> System.out.print(student + " "));
    }


    public int compareTo(Student student) {
        return Integer.compare(this.course, student.course);
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}
