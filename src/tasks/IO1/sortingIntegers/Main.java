package tasks.IO1.sortingIntegers;

import java.io.*;
import java.util.*;


/*
* Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
* */
public class Main {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("D:\\Навчання\\Colections\\src\\tasks\\IO1\\sortingIntegers\\sort.txt",false));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream("D:\\Навчання\\Colections\\src\\tasks\\IO1\\sortingIntegers\\sort.txt"))
        ){
            // Writer random integer values in fail
            Random random = new Random();
            for (int i =0; i < 1000; i++){
                int value = random.nextInt(10000);
                dataOutputStream.writeInt(value);
                System.out.print(value + ", ");
            }
            System.out.println();

            // sorter file
            List<Integer> list = new ArrayList<>();
            while (dataInputStream.available() > 0){
                list.add(dataInputStream.readInt());
            }
            Collections.sort(list);
            for (int i =0; i < list.size(); i++){
                dataOutputStream.writeInt(list.get(i));
            }
            // Print sorred file
            while (dataInputStream.available() > 0){
                System.out.print(dataInputStream.readInt() + ", ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
