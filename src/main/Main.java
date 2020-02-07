package main;

import algoritms.sort.Insertion;
import algoritms.sort.Merge;
import algoritms.sort.Selection;
import algoritms.sort.Sort;

import colectioms.list.singLinkedList.SinglLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglLinkedList<Person> list = new SinglLinkedList<>();
        int[] mas = new int[8];
        mas[0] = 4;
        mas[1] = 2;
        mas[2] = 6;
        mas[3] = 8;
        mas[4] = 1;
        mas[5] = 3;
        mas[6] = 7;
        mas[7] = 5;
        Sort sort = new Merge();
        sort.sort(mas);
//        for (int i = 0; i< mas.length; i++){
//            System.out.println(mas[i]);
//        }
    }
}
