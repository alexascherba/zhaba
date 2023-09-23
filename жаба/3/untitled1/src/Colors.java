import java.util.Scanner;
public enum Colors{
    WHITE(1), YELLOW(2), GREEN(3), BLUE(4), RED(5), PURPLE(6), BLACK(7);
    private int number;
    private Colors(int n){
        number = n;
    }
    public void show(){
        Colors tp;
        System.out.println("colors: ");
        Colors arr[] = Colors.values();
        for (Colors t : arr){
            System.out.println(t);
        }
    }
    public void color(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер цвета от 1 до 7");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("White");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Green");
                break;
            case 4:
                System.out.println("Blue");
                break;
            case 5:
                System.out.println("Red");
                break;
            case 6:
                System.out.println("Purple");
                break;
            case 7:
                System.out.println("Black");
                break;
        }
    }
}