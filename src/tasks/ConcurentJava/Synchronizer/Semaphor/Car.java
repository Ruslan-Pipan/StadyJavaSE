package tasks.ConcurentJava.Synchronizer.Semaphor;

import java.util.concurrent.Semaphore;

public class Car implements Runnable {
    private int carNumber;
    private static Semaphore semaphore = new Semaphore(5,true);
    private static final boolean PARKIN_PLACE[] = new boolean[5];

    public Car(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.printf("Aвтлмобиль %d подєхад к парковке\n",carNumber);
            int parkinNamber = 0;
            synchronized (PARKIN_PLACE){
                for (int i = 0; i < 5 ; i++) {
                    if (!PARKIN_PLACE[i]){
                        PARKIN_PLACE[i] = true;
                        parkinNamber = i;
                        System.out.printf("Aвтлмобиль %d Запаркувався на %d\n",carNumber,parkinNamber + 1);
                        break;
                    }
                }
            }
            Thread.sleep(1000);
            synchronized (PARKIN_PLACE){
                PARKIN_PLACE[parkinNamber] = false;
            }
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
