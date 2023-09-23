import java.util.Scanner; 
public class Main {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n=6;
        for(int i = 1; i <= 4; i++){
            int result = (int)Math.pow(n, i);
            System.out.println("n^" + i + " = " + result);
        }
    }
}


