package com.mypractice.array;

//If we want to arrange the number which occurs maximum then use list and iterate them.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateNumberUsingCollection {

    public static void main(String[] args) {

        int[] x = { 1, 2, 4, 5, 8, 7, 3, 4, 5, 6, 8, 8 };

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int a : x) {
            if (h.containsKey(a)) {
                h.put(a, h.get(a) + 1);
            } else {
                h.put(a, 1);
            }
        }
        System.out.println("HashMap: " + h);
        Set<Map.Entry<Integer, Integer>> s = h.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(s);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                // TODO Auto-generated method stub
                return -(o1.getValue() - o2.getValue());
            }
        });

        Iterator<Map.Entry<Integer, Integer>> itr = list.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> m = itr.next();
            if (m.getValue() > 1) {
                System.out.println("Duplicate number is: " + m.getKey());
                // break;
            }
        }

    }

}
