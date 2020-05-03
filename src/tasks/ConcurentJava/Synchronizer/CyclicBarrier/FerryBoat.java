package tasks.ConcurentJava.Synchronizer.CyclicBarrier;

public class FerryBoat implements Runnable {
    @Override
    public void run() {
        System.out.println("Паром переправим автомобиль");
    }
}
