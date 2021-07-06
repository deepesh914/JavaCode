package com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AlphabetCount {

    public static void main(String[] args) {
        String value = "abcccccddddd";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        // List<Character> list = new ArrayList<Character>();
        for (char c : value.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                // list.add(c);
            } else {
                map.put(c, 1);
            }
        }
        int count = 0;
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        System.out.println("set: " + set);
        // System.out.println("list: " + list);

        for (Map.Entry<Character, Integer> valueData : set) {
            if (valueData.getValue() % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println(map.size() == count ? "Even" : "Odd");

    }

}
