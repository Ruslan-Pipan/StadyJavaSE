package main;

import colectioms.Colection;
import colectioms.queue.Queue;
import colectioms.stack.Stack;

public class Main {
    public static void main(String[] args) {
        Colection colection = new Queue();
        for (int i = 0; i < 3; i++){
            colection.push(i);
        }
        for (int i = 0; i < 1; i++){
            int box = colection.pop();
            System.out.println(box);
        }
        colection.clear();
        System.out.println("Size" + colection.size());
        System.out.println("???????????????????????????");
        for (int i = 0; i < 11; i++){
            colection.push(i);
        }
        for (int i = 0; i < 3; i++){
            int box = colection.pop();
            System.out.println(box);
        }
        System.out.println("Size" + colection.size());
    }
}
