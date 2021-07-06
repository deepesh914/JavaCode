package com.Collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ShortCutDuplicateFind {

    public static void main(String[] args) {
        int[] a = { 2, 5, 8, 6, 4, 2, 8, 6, 1, 2, 7, 1 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        // System.out.println(map);
        Set<Entry<Integer, Integer>> set = map.entrySet();

        for (Entry<Integer, Integer> value : set) {
            if (value.getValue() > 1) {
                System.out.println("Duplicate value are " + value.getKey() + " - " + value.getValue());
            }
        }
    }

}
