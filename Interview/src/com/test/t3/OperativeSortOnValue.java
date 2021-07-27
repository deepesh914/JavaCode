package com.test.t3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperativeSortOnValue {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 7);
        map.put("b", 3);
        map.put("c", 8);

        List<Entry<String, Integer>> l = map.entrySet().stream().sorted((m1, m2) -> m1.getValue() - m2.getValue())
                                            .collect(Collectors.toList());

        Stream<Entry<String, Integer>> m = map.entrySet().stream().sorted((m1, m2) -> m1.getValue() - m2.getValue());

        Iterator<Entry<String, Integer>> itr = l.listIterator();
        while (itr.hasNext()) {
            Entry<String, Integer> e = itr.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }

}
