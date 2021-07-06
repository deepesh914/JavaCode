package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Deep");
        list.add("Ravi");
        list.add(1, "Ram");
        list.add(null);
        list.add(null);
        // System.out.println(list.size());
        // System.out.println(list.contains("Ram"));

        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);

        for (String s : list) {
            System.out.println(s);
        }
        // OR

        /*
         * Iterator itr = list.iterator(); while(itr.hasNext()){ System.out.println(itr.next()); }
         */

    }

}
