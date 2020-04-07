package tasks.Set.TreSetTasks;

import java.util.Iterator;
import java.util.Set;

import java.util.TreeSet;

public class Tasks {

    private Set<Integer> set = new TreeSet<>();
    private  Iterator<Integer> iterator;

    public Tasks() {
        containecSet();
    }
    private void containecSet(){
        for (int i = 0; i<10; i++){
            set.add(i);
        }
    }

    public Integer getNexElement(Integer elem){
        iterator = set.iterator();
        while (iterator.hasNext()){
            Integer tmp = iterator.next();
            if(tmp.equals(elem))
                return iterator.next();
        }
         return null;
    }
    public  Set<Integer> getPrevElement(Integer elem){
        iterator = set.iterator();
        int counter = -1;
        Set<Integer> newSet = new TreeSet<>();
        while (iterator.hasNext()){
            counter++;
            Integer tmp = iterator.next();
            if (tmp.equals(elem)) {
                iterator = set.iterator();
                while (counter != -1){
                    tmp = iterator.next();
                    newSet.add(tmp);
                    counter--;
                }
                break;
            }
        }
       return newSet;
    }
}
