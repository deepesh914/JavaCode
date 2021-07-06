package com.Collection;

import java.util.HashMap;
import java.util.Map;

//Use of Map.Entry
public class HashMapForEach {

    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        h.put(1, "Deep");
        h.put(2, "Deepu");
        h.put(3, "Deepali");
        h.put(4, "Deepesh");
        h.put(5, "Deepu");
        System.out.println(h);
        for (Map.Entry<Integer, String> value : h.entrySet()) {
            System.out.println(value.getKey() + " " + value.getValue());
        }
    }

}
