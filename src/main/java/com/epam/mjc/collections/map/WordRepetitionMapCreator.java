package com.epam.mjc.collections.map;
import java.util.Map;
import java.util.TreeMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> map=new TreeMap<>();
        while (sentence!=""){
            boolean state=false;
           int index=sentence.indexOf(' ');
           if(index<sentence.indexOf('.') && index!=-1){
               if (index<sentence.indexOf(',') && sentence.indexOf(',')!=-1){

               }else {
                   if (sentence.indexOf(',')==-1){

                   }else {
                       index = sentence.indexOf(',');
                   }
               }
           }
           else{
               index=sentence.indexOf('.');
               if(index<sentence.indexOf(',')&&sentence.indexOf(',')!=-1){

               }else {
                   if (sentence.indexOf(',')==-1){

                   }else {
                       index = sentence.indexOf(',');
                   }
               }
           }
            if (index==0){
                sentence=sentence.substring(1);
            }else {
                String word;
                if (index != -1) {
                    word = sentence.substring(0, index).toLowerCase();
                    sentence = sentence.substring(index + 1);
                } else {
                    word = sentence.toLowerCase();
                    sentence = "";
                }
                for (String key : map.keySet()) {
                    if (key.equals(word)) {
                        state = true;
                        map.put(key, map.get(key) + 1);
                    }
                }
                if (!state) {
                    map.put(word, 1);
                }
                if (index == -1) {
                    sentence = "";
                    break;
                }
            }
        }
        return map;
    }
}
