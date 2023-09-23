public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random () * (155-5+1) + 5);
        if (a >= 25 && a <= 100) {
            System.out.println (a + " - Число попало в интервал");
        }
        else {
            System.out.println (a + " - Число не попало в интервал");
        }
    }
}