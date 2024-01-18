package com.epam.mjc.collections.map;
import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> map=new HashMap<>();
        Map<Integer, String> source=new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            source.put(entry.getKey(),entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : source.entrySet()) {
            map.put(entry.getValue(),entry.getKey());
        }
        return map;
    }
}
