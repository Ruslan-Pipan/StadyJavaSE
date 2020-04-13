package tasks.shipsMultithreding;

import tasks.shipsMultithreding.enums.ShipType;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GeneratorShips generatorShips = new GeneratorShips(9);
        Ship ship = new Ship(generatorShips);
        Tunel tunel = new Tunel(ship);
        Berth berthBANANNAS = new Berth(ShipType.BANANNAS.getType(), tunel);
        Berth berthCLOTHINGS = new Berth(ShipType.CLOTHINGS.getType(), tunel);
        Berth berthBOOKS = new Berth(ShipType.BOOKS.getType(), tunel);

        Thread threadBANANNAS = new Thread(berthBANANNAS);
        Thread threadCLOTHINGS = new Thread(berthCLOTHINGS);
        Thread threadBOOKS = new Thread(berthBOOKS );
        Thread threadTunel = new Thread(tunel);

        threadCLOTHINGS.setName("CLOTHINGS");
        threadBANANNAS.setName("BANANNAS");
        threadBOOKS.setName("BOOKS");
        threadTunel.setName("Tunel");

        threadCLOTHINGS.start();
        threadBOOKS.start();
        threadBANANNAS.start();
        threadTunel.start();


        generatorShips.newGeberator(new GeneratorShips(9));



        threadCLOTHINGS.join();
        threadBOOKS.join();
        threadBANANNAS.join();
        threadTunel.join();
    }
}
