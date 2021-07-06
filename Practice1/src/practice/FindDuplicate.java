package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] x = { 1, 2, 4, 5, 8, 7, 3, 4, 5, 6, 8, 8 };
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : x) {
            if (h.containsKey(i)) {
                h.put(i, h.get(i) + 1);
            } else {
                h.put(i, 1);
            }
        }
        System.out.println(h);

        // Set<Entry<Integer, Integer>> set = h.entrySet();
        // Iterator<Entry<Integer, Integer>> itr = set.iterator();
        // while (itr.hasNext()) {
        // Map.Entry<Integer, Integer> val = itr.next();
        // if (val.getValue() > 1) {
        // System.out.println(val.getKey());
        // }
        // }

        Set<Map.Entry<Integer, Integer>> set = h.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
        // Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
        //
        // @Override
        // public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
        // return o2.getValue() - o1.getValue();
        // }
        // });

        Collections.sort(list, (i1, i2) -> i2.getValue() - i1.getValue());

        Iterator<Map.Entry<Integer, Integer>> itr = list.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> value = itr.next();
            if (value.getValue() > 1) {
                System.out.println("Max value contains this no : " + value.getKey());
            }
        }
    }

}
