package colectioms.list;

import colectioms.Colection;
import colectioms.list.singLinkedList.DataList;

public interface List extends Colection {
    void addByIndex(int element, int index);
    void remove(int index);
    void print();
}
