package tasks.multithreading.shipsMultithreding;

import tasks.multithreading.shipsMultithreding.enums.ShipSize;
import tasks.multithreading.shipsMultithreding.enums.ShipType;

import java.util.Queue;

public class Ship {
    private int shipSize;
    private String shipType;
    private boolean full;
    private int counter;
    private GeneratorShips generatorShips;

    public Ship(ShipSize shipSize, ShipType shipType){
        this.shipSize = shipSize.getSize();
        this.shipType = shipType.getType();
        this.full = false;
        this.counter = 0;
    }
    public Ship(int shipSize, String shipType){
        this.shipType = shipType;
        this.shipSize = shipSize;
        this.full = false;
        this.counter = 0;
    }

    protected Ship( GeneratorShips generatorShips) {
        this.generatorShips = generatorShips;
    }

    public int addWare(){
        if (isFull())
            counter = counter + 10;
        return counter;
    }

    protected synchronized Queue<Ship> getQueueShips(){
        return generatorShips.getDeque();
    }

    public boolean isFull(){
        return counter < shipSize;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipSize=" + shipSize +
                ", shipType='" + shipType + '\'' +
                ", counter=" + counter +
                '}';
    }

    public String getShipType() {
        return shipType;
    }

}
