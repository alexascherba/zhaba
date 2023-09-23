package org.example;


public class App 
{
    public static void main( String[] args )
    {
        NewThread thread = new NewThread();
        thread.start();
        Thread thread1 = new Thread(new NewRunnable());
        thread1.start();
        Thread thread2 = new Thread(new NewRunnable());
        thread2.start();
        Thread thread3 = new Thread(new NewRunnable());
        thread3.start();
    }
}
