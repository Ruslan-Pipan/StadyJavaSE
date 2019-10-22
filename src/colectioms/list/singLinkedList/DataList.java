package colectioms.list.singLinkedList;

  class DataList {
      private int index;
      private int date;
      private DataList next;

     DataList(int element){
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

      void setDate(int date) {
        this.date = date;
     }

     int getDate() {
        return date;
     }


     void setNext(DataList next) {
        this.next = next;
     }

}
