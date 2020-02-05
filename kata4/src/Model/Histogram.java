package Model;

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
    public void increment(T key){
        if (histogramMap.containsKey(key)){
            histogramMap.put(key, histogramMap.get(key) + 1);
        }else{
            histogramMap.put(key, 1);
        }
    }
}
