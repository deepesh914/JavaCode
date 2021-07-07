package com.test.t1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M1 {

    public static void main(String[] args) {
        String s = "sampling string";
        char[] c1 = s.replace(" ", "").toCharArray();

        HashMap<Character, Integer> h = new HashMap<Character, Integer>();

        for (char c : c1) {
            if (h.containsKey(c)) {
                h.put(c, h.get(c) + 1);
            } else {
                h.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> set = h.entrySet();
        // List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(set);
        //
        // Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
        //
        // @Override
        // public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        // return -(o1.getValue() - o2.getValue());
        // }
        // });
        //
        // Iterator<Map.Entry<Character, Integer>> itr = list.iterator();
        Iterator<Map.Entry<Character, Integer>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry<Character, Integer> m1 = itr.next();
            if (m1.getValue() > 1) {
                System.out.println("Maximum value: " + m1.getKey() + " and it's value: " + m1.getValue());
            }
        }
    }

}
