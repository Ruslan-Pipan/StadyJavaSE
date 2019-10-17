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


        list.push(1); //0
        list.push(2); //1
        list.push(3); //2
        list.push(4); //3
        list.push(5); //4

        System.out.println("Add " );
        list.print();



        list.remove(1);
        list.remove(2);
        list.remove(3);

        System.out.println("Remove");
        list.print();

        list.push(0); //0
        list.push(1); //1
        list.push(2); //2
        list.push(3); //3

        System.out.println("Add " );
        list.print();

        list.addByIndex(10101,1);
        list.addByIndex(10101,2);
        list.addByIndex(10101,3);

        System.out.println("Size" + list.size());

        System.out.println("All element");
        list.print();
    }
}
