package tasks.serialization.externalizable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("D:\\Навчання\\Colections\\src\\tasks\\serialization\\externalizable\\car.bin");
        Car car = new Car("bmw", 15.654, 5000);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))
        ){
            outputStream.writeObject(car);

            car = null;

            car = (Car)inputStream.readObject();

            System.out.println(car);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
