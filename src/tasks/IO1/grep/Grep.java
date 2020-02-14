package tasks.IO1.grep;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;


/*
*  Функція приймає деректорію, і строку. Проходить по всіх файлах в цій деректорії і виводить
*               [назву файла, номер строки, і строку]
*
* */
public class Grep extends SimpleFileVisitor<Path> {

    private String value;

    public Grep(String value){
        this.value = value;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        List<String> lines = Files.readAllLines(file);
        int counter = 0;
        for (String tmp:lines) {
            counter++;
            if(tmp.contains(value)){
                Path path = file.getFileName();
                System.out.println("Name file: "+ path + ", Number lines: " + counter);
                System.out.println("Content: " + tmp);
                System.out.println();
            }
        }
        return FileVisitResult.CONTINUE;
    }



}
