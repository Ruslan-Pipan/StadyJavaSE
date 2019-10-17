package colectioms.list.singLinkedList;

public class DataList {
    private int date;
    private int index;
    private DataList next;

    public DataList(int element, int index){
        this.date = element;
        this.index = index;
    }

    public DataList getNext() {
        return next;
    }

    public int getDate() {
        return date;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setNext(DataList next) {
        this.next = next;
    }
}
