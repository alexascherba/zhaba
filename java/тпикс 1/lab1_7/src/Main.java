public class Main {
    public static void main(String[] args) {
        int n=0;
        for(int i=1001;i<1000000;i++){
            int k1=i/100000%10,
                    k2=i/10000%10,
                    k3=i/1000%10,
                    k4=i/100%10,
                    k5=i/10%10,
                    k6=i%10;
            if((k1+k2+k3)==(k4+k5+k6)){
                n++;
            }
        }
        System.out.println(n);
    }
}