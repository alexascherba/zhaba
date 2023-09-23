import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите пароль, состоящий из четырех цифр:");
    int pas;
		while(sc.hasNextInt()){
        pas = sc.nextInt();
             String s = Integer.toString(pas); //принимает целое число. Принимает переменную которую нужно преобразовать в строку
        if(s.length() == 4){
            pas = Integer.valueOf(s); //возвращает указанного объекта.
            System.out.println("Ваш пароль: " + pas);
        }else{
            System.out.println("Пароль не верный.\n Попробуйте еще раз:");
        }
    }
}

}