package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram <T>{
    private final Map <T, Integer> histogramMap = new HashMap <T, Integer>();
    
    public Integer get (T key){
        return histogramMap.get(key);
    }
    public Set <T> keySet(){
        return histogramMap.keySet();
    }
    public void increment(T key, int v){
        histogramMap.put(key, v);
    }
}
