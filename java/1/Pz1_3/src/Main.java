public class Main {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        b = (byte) i;
        i = (int)d;
        b = (byte)d;

        System.out.println(b);
        System.out.println(i);
        System.out.println(d);
    }
}