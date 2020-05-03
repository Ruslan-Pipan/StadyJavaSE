package tasks.ConcurentJava.Synchronizer.Exchanger;

public class Truck implements Runnable {
    private int number;
    private String dep,dest;
    private String[] parcels;

    public Truck(int number, String dep, String dest, String[] parcels) {
        this.number = number;
        this.dep = dep;
        this.dest = dest;
        this.parcels = parcels;
    }

    @Override
    public void run() {
        System.out.printf("B грузовик %d погрузив: %s і %s\n",number,parcels[0],parcels[1]);
        System.out.printf("Грузовик №%d выехал из пункта %s в пункт %s.\n", number, dep, dest);
        try {
            Thread.sleep(1000 + (long) Math.random() * 5000);
            System.out.printf("Грузовик №%d приехал в пункт Е.\n", number);
            parcels[1] = Deliver.EXCHANGER.exchange(parcels[1]);
            System.out.printf("В грузовик №%d переместили посылку для пункта %s.\n", number, dest);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
