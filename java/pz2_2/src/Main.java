public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.nameStudent = "Ivan";
        ivanov.numberCourse = 3;
        System.out.println("Ivanov: name - " + ivanov.nameStudent + ", course - " + ivanov.numberCourse);
        Student petrov = ivanov;
        System.out.println("Ivanov: name - " + ivanov.nameStudent + ", course - " + ivanov.numberCourse);
        System.out.println("Petrov: name - " + petrov.nameStudent + ", course - " + petrov.numberCourse);
        ivanov = null;


    }
}