package com.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        //in Map we don't have add() method but we have put method instead;
        map.put("name","Saddar");
        map.put("roll","21SW077");

        //now to print we can use
        System.out.println(map);

        //we can print single value by providing key value
        System.out.println(map.get("name"));

        //but to print all values we can use loop but how to iterate keys of each value?
        //for this we first create keySet to store all keys
        Set<String> set=map.keySet();


        //now to print each value in different row we can use for each loop
        for (String key:set){
            System.out.println(key+": "+map.get(key));
        }


        //if we put same key for another value say (key="name",value="Babar") it will replace the initial value because Map is mutable
        map.put("roll","21SW077");
        System.out.println("roll: "+map.get("roll"));
    }

}
