package colectioms.list;

import colectioms.Colection;


public interface List extends Colection {
    boolean add(int element, int index);
    boolean set(int index, int elemeny);
    int get(int E);
    boolean isHas(int element);
    boolean remove(int index);
    void print();
}
