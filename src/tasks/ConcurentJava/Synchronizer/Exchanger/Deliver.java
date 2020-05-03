package tasks.ConcurentJava.Synchronizer.Exchanger;

import java.util.concurrent.Exchanger;

public class Deliver {
     protected static final Exchanger<String> EXCHANGER = new Exchanger<>();

    public static void main(String[] args) throws InterruptedException {
        String[] p1 = new String[]{"{Пшсилка A -> D}","{посилка A -> C}"};
        String[] p2 = new String[]{"{Пшсилка B -> C}","{посилка B -> D}"};

        new Thread(new Truck(1, "A", "D", p1)).start();//Отправляем 1-й грузовик из А в D
        Thread.sleep(100);
        new Thread(new Truck(2, "B", "C", p2)).start();//Отправляем 2-й грузовик из В
    }
}
