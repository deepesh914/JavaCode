package com.Collection;

// Finding maximum times occurrence of the number
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateFindmax {

    public static void main(String[] args) {
        int[] b = { 2, 5, 8, 6, 4, 2, 8, 6, 1, 2, 7, 7, 1, 2, 4, 4, 4, 4 };
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < b.length; i++) {
            if (m.containsKey(b[i])) {
                m.put(b[i], m.get(b[i]) + 1);
            } else {
                m.put(b[i], 1);
            }
        }
        /*
         * for(int a : b) { if(m.containsKey(a)){ m.put(a, m.get(a)+1); } else{ m.put(a,1); } }
         */
        System.out.println("HashMap : " + m);
        Set<Map.Entry<Integer, Integer>> set = m.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

                return -(o1.getValue() - o2.getValue());
            }

        });
        System.out.println("ArrayList : " + list);

        Iterator<Map.Entry<Integer, Integer>> itr = list.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> value = itr.next();
            System.out.println("Maximun value is " + value.getKey());
            // break;
        }

        for (Map.Entry<Integer, Integer> e : set) {
            if (e.getValue() > 1) {
                System.out.println("Max time: " + e.getKey());
            }
        }
    }
}
