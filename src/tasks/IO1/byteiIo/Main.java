package tasks.IO1.byteiIo;
/*
* Создайте файл, запишите в него произвольные данные и закройте файл.
* Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.
* */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bF = new BufferedReader(new InputStreamReader(System.in));
             OutputStream fileOutputStream = new FileOutputStream("D:\\Навчання\\Colections\\src\\tasks\\IO1\\byteiIo\\test.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\Навчання\\Colections\\src\\tasks\\IO1\\byteiIo\\test.txt"),200)
        ){
            String value = bF.readLine();
            fileOutputStream.write(value.getBytes());
            fileOutputStream.flush();

            int tmp;

            while ((tmp = bufferedInputStream.read()) != -1){
                System.out.print((char) tmp);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
