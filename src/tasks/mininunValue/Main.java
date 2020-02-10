package tasks.mininunValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/*
* Минимальное из N чисел(использовать LinkedList):
* 1. Ввести с клавиатуры число N.
* 2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
* 3. Найти минимальное число среди элементов списка - метод getMinimum.
 *
* */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new LinkedList<>();
        getIntegerList(list);
        System.out.println(getMinimum(list));
    }
    private static  void getIntegerList(List list) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
    }
    private static int getMinimum(List list){
        int min = (int) list.get(0);
        for (int i = 1; i < list.size(); i++){
            int next = (int) list.get(i);
            if (min > next) min = i;
        }
        return min;
    }
}
