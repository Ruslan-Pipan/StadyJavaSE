package tasks.ConcurentJava.Synchronizer.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private int carNamber;
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(5,new FerryBoat());
    public Car(int carNamber) {
        this.carNamber = carNamber;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Автомобиль %d подєхал к паромной переправе\n",carNamber);
            cyclicBarrier.await();
            System.out.printf("Автомобиль %d продовжив рух\n",carNamber);
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
