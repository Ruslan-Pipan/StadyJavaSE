package tasks.Set.TreSetTasks;

import java.util.*;

public class Tasks {

    private NavigableSet<Integer> set = new TreeSet<>();
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
         return set.higher(elem);
    }
    public  Set<Integer> getPrevElement(Integer elem){
        return set.headSet(elem);
    }
}
