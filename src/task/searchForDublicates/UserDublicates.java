package task.searchForDublicates;

import java.util.*;

public class UserDublicates {
    public  List<User> findDuplicates(Collection<User> collA, Collection<User> collB){
        ArrayList<User> result = new ArrayList<>();
        result.addAll(collB);
        collA.retainAll(result);
        return result;
    }
}
