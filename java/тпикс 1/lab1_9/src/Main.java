public class Main {
    public static void main(String[] args) {
        int n = (int)(Math.random()*28800); 
        int hours= n/3600;
        System.out.println("Секунд осталось: "+n);
        switch(hours){
            case 0:
                System.out.println("Осталось меньше часа");
                break;
            case 1:
                System.out.println("Остался "+hours+" час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Осталось "+hours+" часа");
                break;
            default:
                System.out.println("Осталось "+hours+ " часов");

        }
    }
}
