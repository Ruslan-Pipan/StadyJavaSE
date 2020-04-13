package tasks.shipsMultithreding;

import tasks.shipsMultithreding.enums.ShipSize;
import tasks.shipsMultithreding.enums.ShipType;

import java.util.Deque;
import java.util.LinkedList;


public class GeneratorShips {
    private  Deque<Ship> deque = new LinkedList<>();
    public GeneratorShips(int howManyShips) {
        generatorShips(howManyShips);
    }

    public void newGeberator(GeneratorShips generatorShips){
        deque.addAll(generatorShips.getDeque());
    }
    private void generatorShips(int size){
        deque.add(new Ship(ShipSize.FIFTY, ShipType.CLOTHINGS));
        deque.add(new Ship(ShipSize.FIFTY, ShipType.BANANNAS));
        deque.add(new Ship(ShipSize.FIFTY, ShipType.BOOKS));
        deque.add(new Ship(ShipSize.HUNDRET, ShipType.CLOTHINGS));
        deque.add(new Ship(ShipSize.HUNDRET, ShipType.BANANNAS));
        deque.add(new Ship(ShipSize.HUNDRET, ShipType.BOOKS));
        deque.add(new Ship(ShipSize.TEN, ShipType.BOOKS));
        deque.add(new Ship(ShipSize.TEN, ShipType.BANANNAS));
        deque.add(new Ship(ShipSize.TEN, ShipType.CLOTHINGS));
    }

    public Deque<Ship> getDeque() {
        return deque;
    }
    public void addShip(Ship ship){
        deque.add(ship);
    }
}
