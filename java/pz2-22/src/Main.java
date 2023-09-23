public class Main {
    public static void main(String[] args) {
        People str1 = new People("Alex; 25; 78; 170");
        str1.show();
        String str2 = "Alex; 25; 80; 180";
        char[] var3= str2.toCharArray();
        int var4 = var3.length;
        for( int var5 = 0; var5 < var4; var5++){
            char i = var3[var5];
            System.out.print(i);
        }
        str1.compare(str2);
        str1.change();
        str1.show();
    }
}