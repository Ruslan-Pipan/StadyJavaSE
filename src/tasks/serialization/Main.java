package tasks.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Elefan",5,120);
        Animal newAnimal;
        File f = new File("D:\\Навчання\\Colections\\src\\tasks\\serialization\\serialization.bin");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))
        ){
            outputStream.writeObject(animal);
            newAnimal = (Animal)inputStream.readObject();

            System.out.println(newAnimal);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
