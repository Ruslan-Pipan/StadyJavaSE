package tasks.ConcurentJava.Synchronizer.CountDownLatch;

public class Race {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
             new Thread(new Car(i)).start();
        }
        System.out.println("Na start");
        Car.countDownLatch.countDown();
        System.out.println("Bnimania");
        Car.countDownLatch.countDown();
        System.out.println("Marsh");
        Car.countDownLatch.countDown();

    }
}
