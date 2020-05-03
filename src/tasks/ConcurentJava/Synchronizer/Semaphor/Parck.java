package tasks.ConcurentJava.Synchronizer.Semaphor;

public class Parck {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            new Thread(new Car(i)).start();
        }
    }
}
