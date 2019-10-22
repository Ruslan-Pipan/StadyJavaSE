package colectioms.list.singLinkedList;

import colectioms.list.List;

public class SinglLinkedList  implements List  {
    private DataList head;
    private int quentati = -1;
    public SinglLinkedList(){
        this.head = null;
        this.quentati = -1;
    }

    @Override
    public boolean add(int element, int index) {
        DataList elemenyЕqualsIndex = lockingForIndex(index);
        if (elemenyЕqualsIndex != null){
            DataList newElement = new DataList(element);
            DataList boxAfterElement = elemenyЕqualsIndex.getNext();
            newElement.setNext(boxAfterElement);
            elemenyЕqualsIndex.setNext(newElement);
            ++quentati;
            return true;
        }else if(index == quentati + 1) {
            push(element);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean set(int index, int element) {
        DataList lockinElenent = lockingForIndex(index);
        if (lockinElenent == null){
            return false;
        }
        lockinElenent.setDate(element);
        return true;
    }

    @Override
    public int get(int index) {
        if (index > quentati)
            return -1;
        if (index == quentati)
            return head.getDate();
        if (index == 0){
            DataList element = lockingForIndex(0);
            return element.getDate();
        }
        DataList element = lockingForIndex(index);
        return  element.getDate();

    }

    @Override
    public boolean isHas(int element) {
        if (element == head.getDate())
            return true;
        DataList lockingElement = lockingForIndex(0);
        if(lockingElement.getDate() == element)
            return true;
        int lockinElement = lockingForelement(element);

        return lockinElement >= 0;
    }

    @Override
    public boolean remove(int index) {
        if(index > quentati){
            return false;
        }
        if(index == quentati){
            head = head.getNext();
            quentati--;
            return true;
        }
        if(index == 0){
            DataList lokin = lockingForIndex(1);
            lokin.setNext(null);
            quentati--;
            return true;
        }
        DataList lokinForIndex = lockingForIndex(index);
        DataList elementAfter = lokinForIndex.getNext();
        DataList elementBefor = lockingForIndex(index + 1);
        elementBefor.setNext(elementAfter);
        quentati--;
        return true;
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
    public boolean push(int element) {
        DataList dataList = new DataList(element);
        dataList.setNext(head);
        head = dataList;
        quentati++;
        return true;
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

    @Override
    public boolean equals() {
        return false;
    }

    private int lockingForelement(int element){
        DataList lockingElement = head;
        if (head.getDate() == element)
            return lockingElement.getDate();
        lockingElement = lockingForIndex(0);
        if (lockingForIndex(0).getDate() == element)
            return lockingElement.getDate();
        for (int i = 1; i < quentati; i++){
            lockingElement = lockingForIndex(i);
            if (lockingElement.getDate() == element)
                return lockingElement.getDate();
        }
        return -1;
    }

    private DataList lockingForIndex(int index){
        DataList elementLoking = head;
        if(index == quentati)
            return elementLoking;

        int nowIndex = quentati;
        for (int i = 0; i <= quentati; i++){
            if (index == nowIndex){
                return elementLoking;
            }
            elementLoking = elementLoking.getNext();
            nowIndex--;
        }
        return null;
    }

}
