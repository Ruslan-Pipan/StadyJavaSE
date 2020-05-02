package tasks.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

public class Main {
    public static void main(String[] args) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("D:\\Навчання\\Colections\\src\\tasks\\NIO\\sort.txt","r");

            FileChannel fileChannel = file.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate((int) fileChannel.size());
            fileChannel.read(buffer);
            buffer.flip();
            for (int i =0; i < fileChannel.size(); i++){
                System.out.println((char) buffer.get());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
