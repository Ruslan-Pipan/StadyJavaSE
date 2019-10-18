package colectioms.list.singLinkedList;

import colectioms.list.List;

public class SinglLinkedList  implements List  {
    private DataList head;
    private int quentati;
    public SinglLinkedList(){
        this.head = null;
        this.quentati = -1;
    }

    @Override
    public void addByIndex(int element, int index) {
        DataList elemenyЕqualsIndex = lockingForIndex(index);
        if (elemenyЕqualsIndex != null){
            DataList newElement = new DataList(element);
            DataList boxAfterElement = elemenyЕqualsIndex.getNext();
            newElement.setNext(boxAfterElement);
            elemenyЕqualsIndex.setNext(newElement);
            ++quentati;
            return;
        }else if(index == quentati + 1) {
            push(element);
        }else {
            System.out.println("Last index in which we add element is " + (quentati+1) );
        }
    }

    @Override
    public void remove(int index) {
        if(index > quentati){
            System.out.println("Index haven't.");
            return;
        }
        if(index == quentati){
            head = head.getNext();
            quentati--;
            return;
        }
        if(index == 0){
            DataList lokin = lockingForIndex(1);
            lokin.setNext(null);
            quentati--;
            return;
        }
        DataList lokinForIndex = lockingForIndex(index);
        DataList elementAfter = lokinForIndex.getNext();
        DataList elementBefor = lockingForIndex(index + 1);
        elementBefor.setNext(elementAfter);
        quentati--;
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
        DataList dataList = new DataList(element);
        dataList.setNext(head);
        head = dataList;
        quentati++;
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
        return quentati + 1;
    }

    @Override
    public void clear() {
        head = null;
    }

    private DataList lockingForIndex(int index){
        DataList elementLoking = head;
        int nowIndex = quentati;
        for (int i = 0; i <= quentati; i++){
            if (index == nowIndex){
                return elementLoking;
            }
            elementLoking = elementLoking.getNext();
            nowIndex--;
        }
        return elementLoking;
    }

}
