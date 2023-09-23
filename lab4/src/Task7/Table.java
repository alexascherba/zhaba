package Task7;

import java.util.ArrayList;
import java.util.List;

public class Table implements Runnable{
    private int id;
    private List<Boolean> forks;

    Table(int id, List<Boolean> forks) {
        this.id = id;
        this.forks = forks;
    }
    private void takeForks() throws InterruptedException {
        int leftForkIndex = id;
        int rightForkIndex = (id + 1) % forks.size();

        synchronized (forks) {
            while (forks.get(leftForkIndex) || forks.get(rightForkIndex)) {
                forks.wait();
            }
            forks.set(leftForkIndex, true);
            forks.set(rightForkIndex, true);
        }
        System.out.println((id+1) + " из 5 взял вилки");
    }
    private void eat() throws InterruptedException {
        System.out.println((id+1) + " из 5 сейчас ест");
        Thread.sleep(2000);
    }
    private void speak() throws InterruptedException {
        System.out.println((id+1) + " из 5 сейчас общается языком жестов");
        Thread.sleep(1000);
    }
    private void returnForks() {
        int leftForkIndex = id;
        int rightForkIndex = (id + 1) % forks.size();

        synchronized (forks) {
            forks.set(leftForkIndex, false);
            forks.set(rightForkIndex, false);
            forks.notifyAll();
        }
        System.out.println((id+1) + " из 5 вернул вилки");
    }


    public void run() {
        try {
            speak();
            takeForks();
            eat();
            returnForks();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        int numOfPeople = 5;
        List<Boolean> forks = new ArrayList<>(numOfPeople);
        for (int i = 0; i < numOfPeople; i++) {
            forks.add(false);
        }

        List<Thread> threads = new ArrayList<>(numOfPeople);
        for (int i = 0; i < numOfPeople; i++) {
            Runnable man = new Table(i, forks);
            Thread thread = new Thread(man);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}








