package tasks.ConcurentJava.Synchronizer.CyclicBarrier;

public class Ferry {
    public static void main(String[] args) {
        for (int i = 0; i < 90 ; i++) {
            new Thread(new Car(i)).start();
        }
    }
}
