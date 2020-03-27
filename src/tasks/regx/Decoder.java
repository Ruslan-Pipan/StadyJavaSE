package tasks.regx;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Decoder {
    private String fileName;
    private static String decoded;
    public Decoder(String fileName){
        this.fileName = fileName;
    }
    public String getDecoded() {
        decodedM();
        return decoded;
    }

    private String decodedM(){
        try (FileReader fileReader = new FileReader(new File(fileName));
             BufferedReader bufferedReader = new BufferedReader(fileReader);
        ){
            StringBuilder sBFile = new StringBuilder();
            String tmp;
            while ((tmp = bufferedReader.readLine()) != null){
                sBFile.append(tmp);
            }

            Pattern pattern = Pattern.compile("(\\s+)(в|до|за|на|без|під|для|по|поза|понад|через|крім|поміж)(\\s+)", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
            Matcher matcher = pattern.matcher(sBFile);
            decoded = matcher.replaceAll(" JAVA ");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
