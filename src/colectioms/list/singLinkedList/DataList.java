package colectioms.list.singLinkedList;

public class DataList {
    private int date;
    private DataList next;

    public DataList(int element){
        this.date = element;
    }

    public DataList getNext() {
        return next;
    }

    public int getDate() {
        return date;
    }


    public void setNext(DataList next) {
        this.next = next;
    }
}
