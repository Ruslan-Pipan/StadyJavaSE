package tasks.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant(10,500,"Robert","Afrika strit");
        Elephant newElephant;
        File f = new File("D:\\Навчання\\Colections\\src\\tasks\\serialization\\serialization.bin");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))
        ){
            outputStream.writeObject(elephant);

            Elephant.setEays(10);

            newElephant = (Elephant)inputStream.readObject();
            System.out.println(newElephant);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Aye = " + Elephant.getEays());

    }

}
