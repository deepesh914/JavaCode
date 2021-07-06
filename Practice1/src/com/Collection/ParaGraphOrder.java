package com.Collection;

import java.util.Collections;
import java.util.LinkedList;

public class ParaGraphOrder {

    public static void main(String[] args) {
        String s = "View Findings icon is not displaying immediately after finding created for check results or web links";
        s = s.toLowerCase();
        String[] split = s.split(" ");

        LinkedList<String> list = new LinkedList<String>();

        for (int i = 0; i < split.length; i++) {
            list.add(split[i]);
            // Arrays.sort(s, Collections.reverseOrder());
        }
        Collections.sort(list);
        System.out.println(list);
    }

}
