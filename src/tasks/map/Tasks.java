package tasks.map;

import tasks.map.simpleLRU.Lru;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Tasks {
    public static void main(String[] args) {
//        Lru<Integer, String> hashMap = new Lru<>(2);
//        hashMap.put(1,"e");
//        hashMap.put(2,"d");
//        hashMap.put(3,"c");
//        hashMap.get(2);
//        hashMap.put(9,"n");
//        System.out.println(hashMap);


        Map<Object,String> map = new WeakHashMap<>();
        Object object = new Object();
        map.put(object,"infarmation");
        object = null;
        System.gc();
        for (int i =0; i < 10_000; i++){
            if (map.isEmpty()){
                System.out.println("map Empty");
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
