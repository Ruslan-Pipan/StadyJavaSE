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


        list.push(0); //0
        list.push(1); //1
        list.push(2); //2
        list.push(3); //3
        list.push(4); //4


        list.remove(0);
        list.remove(0);
        list.remove(0);


        list.push(5); //0
        list.push(6); //1
        list.push(7); //2
        list.push(8); //3


        list.addByIndex(10100,0);
        list.addByIndex(10101,1);
        list.addByIndex(10102,2);

        System.out.println("Size" + list.size());

        System.out.println("All element");
        list.print();
    }
}
