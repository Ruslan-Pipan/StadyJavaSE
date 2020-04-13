package tasks.IO1.simpl;

import java.io.*;

/*
Создайте файл, запишите в него произвольные данные и закройте файл. З
атем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.
* */
public class main {
    public static void main(String[] args) {
        File file = new File("D:\\Навчання\\Colections\\src\\tasks\\IO1\\simpl\\tex.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             FileOutputStream fileOutputStream = new FileOutputStream(file)
        ){
           byte [] inFile = {12,48,89,45,127,56};
           fileOutputStream.write(inFile);
           fileOutputStream.flush();
           int size = fileInputStream.available();
           for (int i = 0; i < size; i++){
               System.out.println(fileInputStream.read());
           }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
