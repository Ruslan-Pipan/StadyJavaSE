package tasks.dubleWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
*Используя коллекцию удвойте слово:
* 1. Введите с клавиатуры 5 слов в список строк.
* 2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
* 3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
 * */
public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        try {
            for (int i = 0; i < 5; i++){
                String word = bufferedReader.readLine();
                list.add(doubleValues(word));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String tmp : list) {
            System.out.println(tmp.toString());
        }

    }
    private static String doubleValues(String word){
        String result = "";
        for (int i = 0; i < word.length(); i ++){
            result += word.substring(i,i+1) + word.substring(i,i+1);
        }
        return result;
    }
}
