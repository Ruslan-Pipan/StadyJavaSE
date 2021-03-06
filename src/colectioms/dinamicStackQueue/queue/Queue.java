package colectioms.dinamicStackQueue.queue;

import colectioms.dinamicStackQueue.DinamickStack;

public class Queue implements DinamickStack {
    private int contains[];
    private int head;
    private int fail;
    private static final int START_SIZE = 10;

    public Queue(){
        this.contains = new int[START_SIZE];
        this.head = 0;
        this.fail = 0;
    }

    @Override
    public boolean push(int element) {
        if (fail + 1 < contains.length){
            contains[fail++] = element;
            return true;
        }else {
            increaseArray();
            contains[fail++] = element;
            return true;
        }
    }

    @Override
    public int pop(){
        if (fail !=0) {
            int box = contains[0];
            if (fail >= 2) {
                for (int i = 0; i < fail; i++) {
                    contains[i] = contains[i + 1];
                }
            }else {contains[0] = 0;}
            fail--;
            decreaseArray();
            return box;
        }
        return 0;
    }

    @Override
    public int top() {
        return contains[0];
    }

    @Override
    public boolean isEmty() {
        return fail == 0 ? true :false;
    }

    @Override
    public int size() {
        return fail;
    }

    @Override
    public void clear() {
        contains = new int[START_SIZE];
        fail = 0;
    }

    @Override
    public boolean equals() {
        return false;
    }

    private void increaseArray(){
        int[] arrayBox = new int[fail];
        for (int i = 0; i < fail; i++){
            arrayBox[i] = contains[i];
        }
        contains = new int[fail*2 + (fail / 2)];
        for (int i = 0; i < arrayBox.length; i++){
            contains[i] = arrayBox[i];
        }
    }
    private void decreaseArray(){
        if (fail > START_SIZE)
        if (fail  == ((contains.length*2)/5)){
            int[] arrayBox = new int[fail];
            for (int i = 0; i < fail; i++){
                arrayBox[i] = contains[i];
            }
            contains = new int[fail+1];
            for (int i = 0; i < arrayBox.length; i++){
                contains[i] = arrayBox[i];
            }
        }
    }
}
