package main;

import colectioms.Colection;
import colectioms.list.List;
import colectioms.list.singLinkedList.SinglLinkedList;
import colectioms.dinamicStackQueue.queue.Queue;

public class Main {
    public static void main(String[] args) {
        Colection colection = new Queue();
        List list = new SinglLinkedList();


        list.push(0); //0
        list.push(1); //1
        list.push(2); //2
        list.push(3); //3
        list.push(4); //4

        list.remove(1);
        System.out.println(list.isHas(3));
        list.print();
    }
}
