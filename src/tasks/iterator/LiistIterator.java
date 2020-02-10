package tasks.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* Вывод на экран элементов List: Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator
*
* */
public class LiistIterator {
    public static void main(String[] args) {
        List<Double> list =  new ArrayList(10);
        for (int i =0; i<10;i++){
            list.add(Math.random());
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
