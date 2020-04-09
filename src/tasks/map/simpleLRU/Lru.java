package tasks.map.simpleLRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lru<K,V> extends LinkedHashMap<K,V> {

    final private int capasity;
    public Lru(int capasity){
        super(capasity+1,1.2f ,true);
        this.capasity = capasity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){

        return this.size() > capasity;
    }
}
