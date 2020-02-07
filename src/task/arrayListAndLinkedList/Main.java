package task.arrayListAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
* Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
* Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
* Замерьте время, которое потрачено на это.
* Сравните результаты и предположите, почему они именно такие.
* */
public class Main {
    private static int size = 100000;
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        addMilionsElement(arrayList);
        addMilionsElement(linkedList);

        printTimeRandonMilionsEElemens(arrayList);
        printTimeRandonMilionsEElemens(linkedList);

    }
    private static void addMilionsElement(List list){
        for(int i = 1; i <= size; i++){
            list.add(Math.random());
        }
    }
    public static void printTimeRandonMilionsEElemens(List list){
        long startTime = System.currentTimeMillis();
        for (int i = 1; i<= size; i++){
            list.get((int) (Math.random() * (list.size() - 1)));
        }
        System.out.println((System.currentTimeMillis() - startTime) / 1000);
    }
}
