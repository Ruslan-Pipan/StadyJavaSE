package main;

import colectioms.Colection;
import colectioms.list.List;
import colectioms.list.singLinkedList.SinglLinkedList;
import colectioms.queue.Queue;
import colectioms.stack.Stack;

public class Main {
    public static void main(String[] args) {
        Colection colection = new Queue();
        List list = new SinglLinkedList();

        list.push(5); //0
        list.push(10); //1
        list.push(15); //2
        list.push(20); //3
        list.push(25); //4

        list.remove(0);
        list.remove(2);

        list.push(5); //0
        list.push(10); //1
        list.push(15); //2
        list.push(20); //3
        list.push(25); //4

        list.remove(0);
        list.remove(1);
        list.remove(2);
        list.remove(3);
        list.remove(4);


        list.print();
    }
}
