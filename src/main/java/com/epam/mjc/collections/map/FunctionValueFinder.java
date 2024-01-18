package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        boolean state=false;
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Integer value : functionMap.values()) {
            if(value==requiredValue || value*5+2==requiredValue){
                state=true;
                break;
            }
        }
        return state;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer,Integer>integerMap=new HashMap<>();
        for (Integer i : sourceList) {
            integerMap.put(i,i);
        }
        return integerMap;
    }
}
