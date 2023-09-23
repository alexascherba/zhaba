package Task1;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nastya", 2));
        list.add(new Student("Masha", 2));
        list.add(new Student("Sasha", 3));
        list.add(new Student("Tyler", 4));
        list.add(new Student("Mary", 2));
        list.add(new Student("Ann", 1));
        list.add(new Student("Roman", 3));
        list.add(new Student("Gregory", 4));
        list.add(new Student("Katya", 1));
        list.add(new Student("Sergei", 2));

        ArrayList<Student> listCourse1 = new ArrayList<>(Student.printStudents(list, 1));
        listCourse1.forEach(System.out::println);
        // метод forEach(), который принимает лямбда-выражение = student -> System.out.println(student)

        ArrayList<Student> listCourse2 = new ArrayList<>(Student.printStudents(list, 2));
        listCourse2.forEach(System.out::println);

        ArrayList<Student> listCourse3 = new ArrayList<>(Student.printStudents(list, 3));
        listCourse3.forEach(System.out::println);

        ArrayList<Student> listCourse4 = new ArrayList<>(Student.printStudents(list, 4));
        listCourse4.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");

        // Пересечение множеств
        // 1. Создание рандомно заполненных множеств
        ArrayList<String> randomList1 = new ArrayList<>();
        randomList1.add("Gregory");
        randomList1.add("John");
        randomList1.add("Tyler");
        System.out.println("Первое множество: ");
        Student.printLists(randomList1);
        System.out.println();

        ArrayList<String> randomList2 = new ArrayList<>();
        randomList2.add("Tyler");
        randomList2.add("Gregory");
        randomList2.add("Mary");
        System.out.println("Второе множество: ");
        Student.printLists(randomList2);
        System.out.println();

        System.out.println("-----------------------------------");

        ArrayList<String> intersectList = new ArrayList<>(Student.intersect(randomList1, randomList2));
        System.out.println("Общие элементы (пересечение): ");
        Student.printLists(intersectList);
        System.out.println();

        System.out.println("-----------------------------------");

        ArrayList<String> unionList = new ArrayList<>(Student.union(randomList1, randomList2));
        System.out.println("Все элементы (объединение): ");
        Student.printLists(unionList);
        System.out.println();

        System.out.println("Сортировка студентов по курсу:");
        SortedSet<Student> set = new TreeSet<>(list);
        set.forEach(System.out::println);
    }
}