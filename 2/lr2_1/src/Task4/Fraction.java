package Task4;

import java.util.Random;

public class Fraction {
    public int m;
    public int n;
    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }
    public Fraction() {
        this.m = (int) ( 1 + Math.random()*20);
        this.n = (int) ( 1 + Math.random()*20);
    }
    public void reset(int m, int n) {
        this.m = m;
        this.n = n;
    }
    public void show() {
        System.out.println("M: " + this.m + ", N: " + this.n);
    }
    public void reduction() {
        for(int k = 2; k <= Math.abs(this.m) && k <= Math.abs(this.n); k++){
            if(this.m % k == 0 && this.n % k == 0) {
                this.m /= k;
                this.n /= k;
                k = 1;
            }
        }
        if(this.m < 0 && this.n < 0) {
            this.m = Math.abs(this.m);
            this.n = Math.abs(this.n);
        }
    }
    public void sum(Fraction... arr) {
        int denominator = this.n;
        for(int i = 0; i < arr.length; i++) {
            denominator *= arr[i].n;
        }
        this.m = this.m * (denominator / this.n);
        for(int i = 0; i < arr.length; i++) {
            this.m = this.m + (arr[i].m * (denominator / arr[i].n));
        }
        this.n = denominator;
        this.reduction();
    }
    public void subtraction(Fraction obj) {
        this.m = this.m * obj.n - obj.m * this.n;
        this.n = this.n * obj.n;
        this.reduction();
    }
    public void multiplication(Fraction... arr) {
        for(int i = 0; i < arr.length; i++) {
            this.m *= arr[i].m;
            this.n *= arr[i].n;
        }
        this.reduction();
    }
    public void division(Fraction obj) {
        this.m *= obj.n;
        this.n *= obj.m;
        this.reduction();
    }
    public static void mass(Fraction[] arr) {
        System.out.print(arr[0].m + "/" + arr[0].n + "  ");
        for(int i = 2; i < arr.length; i += 2) {
            arr[i-1].sum(arr[i]);
            System.out.print(arr[i-1].m + "/" + arr[i-1].n + "  " + arr[i].m + "/" + arr[i].n + "  ");
        }
        if(arr.length % 2 == 0) {
            System.out.print(arr[arr.length-1].m + "/" + arr[arr.length-1].n + "  ");
        }
        System.out.println();
    }
}
