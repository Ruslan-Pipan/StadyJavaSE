package tasks.IO1.grep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Флешка\\test");
        Files.walkFileTree(path,new Grep("Голова"));
    }
}
