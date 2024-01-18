package com.epam.mjc.collections.map;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        int index=0;
        Map<String,Integer>map=new HashMap<>();
        String str="";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)==' ' || sentence.charAt(i)==',' || sentence.charAt(i)=='.'){
                if(str==""){

                } else {
                    if((map.get(str.toLowerCase()))==null){
                        map.put(str.toLowerCase(),1);
                    }else {
                        map.put(str.toLowerCase(),map.get(str.toLowerCase())+1);
                    }
                }
                str="";
            }else {
                char belgi=sentence.charAt(i);
                if(belgi==',' || belgi=='.' || belgi==' '){

                }else {
                    str += belgi;
                }
            }
        }
        return map;
    }
}
