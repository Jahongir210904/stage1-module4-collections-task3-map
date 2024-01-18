package com.epam.mjc.collections.map;
import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> map=new HashMap<>();
        Map<Integer, String> source=new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            boolean state=false;
            for (int i = 0; i < sourceMap.values().size(); i++) {
                if(entry.getValue()==sourceMap.values().toArray()[i]){
                    state=true;
                    break;
                }
            }
            if (!state){
                source.put(entry.getKey(),entry.getValue());
            }
        }
        for (Map.Entry<Integer, String> entry : source.entrySet()) {
            map.put(entry.getValue(),entry.getKey());
        }
        return map;
    }
}
