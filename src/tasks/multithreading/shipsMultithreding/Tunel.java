package tasks.multithreading.shipsMultithreding;


import java.util.Queue;

public class Tunel implements Runnable{

    private Queue<Ship> queue;
    private Ship ships;

    public Tunel(Ship ship){
        this.queue = ship.getQueueShips();
        this.ships = ship;
    }


    public synchronized Queue<Ship> getQueue() {
        return queue;
    }

    @Override
    public synchronized void run() {
        if (queue.size() == 0)
            queue = ships.getQueueShips();
        if (queue.size() != 0)
            notifyAll();
    }
}
