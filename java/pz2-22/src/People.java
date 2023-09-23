import java.util.Scanner;
public class People {
    public String name;
    public int age, weight, height;
    People(String param){
        String[] parametr = param.split("\\s*;\\s*");
        this.name = parametr[0];
        this.age = Integer.parseInt(parametr[1]);
        this.weight = Integer.parseInt(parametr[2]);
        this.height = Integer.parseInt(parametr[3]);
    }

    public void show(){
        System.out.println(this.name +"; " + this.age + "; "  + this.weight +"; " + this.height);
    }
    public void compare(String str){
        String[] arr = str.split("; ");
        System.out.println();
        System.out.println("Сравнение имён: " + ((this.name.equals(arr[0])) ? "Имена одинаковые" : "Имена разные"));
        System.out.println("Сравнение возраста: " + ((this.age == Integer.parseInt(arr[1])) ? "Возраст одинаковый" : "Возраст разный"));
        System.out.println("Сравнение веса: " + ((this.weight == Integer.parseInt(arr[2])) ? "Вес одинаковый" : "Вес разный"));
        System.out.println("Сравнение роста: " + ((this.height == Integer.parseInt(arr[3])) ? "Рост одинаковый" : "Рост разный"));
    }
    public void change(){
        System.out.println("Введите имя");
        Scanner scan = new Scanner(System.in);
        this.name = scan.nextLine();
        System.out.println("Введите возраст");
        this.age = scan.nextInt();
        System.out.println("Введите вес");
        this.weight = scan.nextInt();
        System.out.println("Введите рост");
        this.height = scan.nextInt();
    }


}