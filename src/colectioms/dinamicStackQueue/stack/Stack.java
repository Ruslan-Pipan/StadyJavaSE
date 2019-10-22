package colectioms.dinamicStackQueue.stack;
import colectioms.dinamicStackQueue.DinamickStack;

public class Stack implements DinamickStack {

    private int[] conteins;
    private static int quantity;
    static final private int SIZE_START = 10;
    public Stack(){
        this.conteins = new int[SIZE_START];
        this.quantity = 0;
    }

    @Override
    public boolean push(int element) {
        if (quantity < conteins.length){
            conteins[quantity++] = element;
            return true;
        }else{
            increaseArray();
            conteins[quantity++] = element;
            return true;
        }
    }

    @Override
    public int pop() {
        if (quantity!=0){
            decreaseArray();
            int box = conteins[quantity - 1];
            conteins[--quantity] = 0;
            return box;
        }
        return 0;
    }

    @Override
    public int top(){
        return conteins[quantity - 1];
    }

    @Override
    public boolean isEmty() {
        return quantity == 0 ? true : false;
    }

    @Override
    public void clear() {
        conteins = new int[SIZE_START];
        quantity = 0;
    }

    @Override
    public boolean equals() {
        return false;
    }

    @Override
    public int size(){ return quantity; }

    private void increaseArray(){
        int[] arrayBox = new int[quantity];
        for (int i = 0; i < quantity; i++){
            arrayBox[i] = conteins[i];
        }
        conteins = new int[quantity*2 + (quantity / 2)];
        for (int i = 0; i < arrayBox.length; i++){
            conteins[i] = arrayBox[i];
        }
    }

    private void decreaseArray(){
        if (quantity > SIZE_START)
        if (quantity  == ((conteins.length*2)/5)){
            int[] arrayBox = new int[quantity];
            for (int i = 0; i < quantity; i++){
                arrayBox[i] = conteins[i];
            }
            conteins = new int[quantity];
            for (int i = 0; i < arrayBox.length; i++){
                conteins[i] = arrayBox[i];
            }
        }
    }

}
