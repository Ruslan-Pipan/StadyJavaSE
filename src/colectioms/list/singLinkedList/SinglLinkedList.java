package colectioms.list.singLinkedList;

import colectioms.list.List;

public class SinglLinkedList<E>  implements List<E>  {
    private DataList head;
    private int quentati = -1;

    public SinglLinkedList(){
        this.head = null;
        this.quentati = -1;
    }

    class DataList{
        private int index;
        private E date;
        private DataList next;

        DataList(E element){
            this.date = element;
            this.index = -1;
        }

        void setIndex(int index) {
            this.index = index;
        }

        int getIndex() {
            return index;
        }

        DataList getNext() {
            return next;
        }

        void setDate(E date) {
            this.date = date;
        }

        E getDate() {
            return date;
        }


        void setNext(DataList next) {
            this.next = next;
        }
    }

    @Override
    public boolean add(E element, int index) {
        DataList elemenyЕqualsIndex = lockingForIndex(index);
        if (elemenyЕqualsIndex != null){
            DataList newElement = new DataList(element);
            DataList boxAfterElement = elemenyЕqualsIndex.getNext();
            newElement.setNext(boxAfterElement);
            elemenyЕqualsIndex.setNext(newElement);
            newElement.setIndex(index);
            changeIndex(newElement,'+');
            ++quentati;
            return true;
        }else if(index == quentati + 1) {
            return add(element);
        }else {
            return false;
        }
    }

    @Override
    public boolean set(int index, E element) {
        DataList lockinElenent = lockingForIndex(index);
        if (lockinElenent == null){
            return false;
        }
        lockinElenent.setDate(element);
        return true;
    }

    @Override
    public E get(int index) {
        if (index > quentati)
            return null;
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
    public boolean isHas(E element) {
        if (element == head.getDate())
            return true;
        DataList lockingElement = lockingForIndex(0);
        if(lockingElement.getDate() == element)
            return true;
        lockingElement = lockingForelement(element);
        if (lockingElement != null){
            return true;
        }
        return false;
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
            changeIndex(lokin,'-');
            return true;
        }
        DataList lokinForIndex = lockingForIndex(index);
        DataList elementAfter = lokinForIndex.getNext();
        DataList elementBefor = lockingForIndex(index + 1);
        elementBefor.setNext(elementAfter);
        quentati--;
        changeIndex(elementBefor,'-');
        return true;
    }

    @Override
    public int indexOf(E element) {
        DataList dataList = lockingForelement(element);
        if (dataList != null)
            return dataList.getIndex();
        return -1;
    }

    @Override
    public void print() {
        DataList element = head;
        while (element != null){
            System.out.println(element.getDate() + " " + element.getIndex());
            element = element.getNext();
        }
    }


    @Override
     public boolean add(E element) {
        DataList dataList = new DataList(element);
        dataList.setNext(head);
        head = dataList;
        quentati++;
        dataList.setIndex(quentati);
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

    private DataList lockingForelement(E element){
        DataList lockingElement = head;
        if (head.getDate() == element)
            return lockingElement;
        lockingElement = lockingForIndex(0);
        if (lockingForIndex(0).getDate() == element)
            return lockingElement;
        for (int i = 1; i < quentati; i++){
            lockingElement = lockingForIndex(i);
            if (lockingElement.getDate() == element)
                return lockingElement;
        }
        return null;
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

    private void changeIndex(DataList element, char choise){
        int index = element.getIndex();
        DataList dataList = head;
        switch (choise){
            case '-':
                while (true){
                    if (dataList.getIndex() == index)
                        break;
                    dataList.setIndex(dataList.getIndex() - 1);
                    dataList = dataList.getNext();
                }
                dataList.setIndex(index - 1);
                break;
            case '+':
                while (true){
                    if (dataList.getIndex() == index)
                        break;
                    dataList.setIndex(dataList.getIndex() + 1);
                    dataList = dataList.getNext();
                }
                dataList.setIndex(index + 1);
                break;
        }
    }

}
