package tasks.ConcurentJava.Synchronizer.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Car implements Runnable {
    private  int carNamber;
    static protected CountDownLatch countDownLatch = new CountDownLatch(3);

    public Car(int carNamber) {
        this.carNamber = carNamber;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println("Car feanshed " + carNamber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
