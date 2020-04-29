package tasks.cloning.deepSerialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Cow burenka = new Cow("Burenka",25,1);

        try{
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            ObjectInputStream inputStream  = new ObjectInputStream(byteArrayInputStream);

            outputStream.writeObject(burenka);
            outputStream.flush();
            outputStream.close();

            Cow cowClone = (Cow)inputStream.readObject();
            inputStream.close();

            System.out.println(burenka);
            System.out.println(cowClone);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
