package colectioms.list;

import colectioms.Colection;


public interface List<E> extends Colection<E> {
    boolean add(E element, int index);
    boolean add(E element);
    boolean set(int index, E elemeny);
    E get(int index);
    boolean isHas(E element);
    boolean remove(int index);
    int indexOf(E element);
    void print();
}
