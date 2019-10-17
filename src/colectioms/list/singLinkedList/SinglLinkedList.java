package colectioms.list.singLinkedList;

import colectioms.list.List;

public class SinglLinkedList  implements List  {
    private DataList head;
    private int index;

    public SinglLinkedList(){
        this.head = null;
        this.index = -1;
    }

    @Override
    public void addByIndex(int element, int index) {
        DataList elemenyЕqualsIndex = lockingForIndex(index);
        if (elemenyЕqualsIndex != null){
            DataList newElement = new DataList(element,elemenyЕqualsIndex.getIndex());
            DataList boxAfterElement = elemenyЕqualsIndex.getNext();
            elemenyЕqualsIndex.setIndex(elemenyЕqualsIndex.getIndex() + 1);
            newElement.setNext(boxAfterElement);
            elemenyЕqualsIndex.setNext(newElement);
            return;
        }
        System.out.println("Haven't element.");
    }

    @Override
    public void remove(int index) {
            if (index == head.getIndex()){
                head = head.getNext();
            }else if (index == 0){
                DataList secondElement = lockingForIndex(1);
                secondElement.setNext(null);
                DataList element = head;
                while (element != null){
                    element.setIndex(element.getIndex()-1);
                    element = element.getNext();
                }
            }else {
                DataList elemenyЕqualsIndex = lockingForIndex(index);
                if (elemenyЕqualsIndex != null){
                    DataList beforElement = elemenyЕqualsIndex.getNext();
                    DataList afreEkement = lockingForIndex(index + 1);
                    afreEkement.setNext(beforElement);

                    DataList element = head;
                    for (int i = index; i <= head.getIndex(); i++){
                        element.setIndex((element.getIndex() - 1));
                        element = element.getNext();
                    }
                }
            }
    }

    @Override
    public void print() {
        DataList element = head;
        while (element != null){
            System.out.println(element.getDate());
            element = element.getNext();
        }
    }


    @Override
    public void push(int element) {
        ++this.index;
        DataList dataList = new DataList(element,index);
        dataList.setNext(head);
        head = dataList;
    }

    @Override // Хз поки, що тут зробити.
    public int pop() {
        return head.getDate();
    }

    @Override
    public int top() {
        return head.getDate();
    }

    @Override
    public boolean isEmty() {
        return head == null;
    }

    @Override
    public int size() {
        return head.getIndex();
    }

    @Override
    public void clear() {
        head = null;
    }

    private DataList lockingForIndex(int index){
        DataList dataList = head;
        if (dataList != null && head.getIndex() >= index)
            for (int i = 0; i <= head.getIndex(); i++){
                if (dataList.getIndex() == index){
                    return dataList;
                }
                dataList = dataList.getNext();
            }
        return null;
    }
}
