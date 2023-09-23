public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        Thread thread1 = new Thread(new Producer(myQueue));
        Thread thread2 = new Thread(new Consumer(myQueue));
        Thread thread3 = new Thread(new Consumer(myQueue));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}