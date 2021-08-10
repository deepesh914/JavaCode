package com.test.t1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OracleMapStream {
    public static void main(String[] args) {
        String s = "She counted. One${$. She could$ hear the$ steps coming closer. Two. Puffs of breath could be seen coming from his mouth. Three. He stopped beside her. Four. She pulled the trigger of the gun.";
        s = s.replaceAll("[.,{$]", "");

        String[] arr = s.split(" ");
        // System.out.println(Arrays.toString(arr));

        // List<String> list = new ArrayList<>();
        // list = Arrays.asList(arr);
        // System.out.println(list);

        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        System.out.println(map);

        List<String> l1 = map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).limit(3).map(e -> e.getKey())
                             .collect(Collectors.toList());
        System.out.println(l1);
    }

}
