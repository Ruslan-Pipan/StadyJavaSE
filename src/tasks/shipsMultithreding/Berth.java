package tasks.shipsMultithreding;

import java.util.Queue;

public class Berth implements Runnable{
    private String berthName;
    private Queue<Ship> queue;

    public Berth(String berthName, Tunel tunel) {
        this.berthName = berthName;
        this.queue = tunel.getQueue();
    }

    @Override
    public synchronized void run() {
        while (true){
            for (Ship s: queue) {
                if (s!=null && checkName(s.getShipType())){
                    while (s.isFull()){
                        s.addWare();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(s);
                }
            }
            try {wait();} catch (InterruptedException e) {e.printStackTrace();}
        }
    }

    private synchronized  boolean  checkName(String berthName){
        return this.berthName.equals(berthName);
    }

}
