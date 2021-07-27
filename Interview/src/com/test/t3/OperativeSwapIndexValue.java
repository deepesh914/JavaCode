package com.test.t3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OperativeSwapIndexValue {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list.indexOf(1));
        List<Integer> list1 = new ArrayList<>();
        Integer temp = 0;
        ListIterator<Integer> i = list.listIterator();
        while (i.hasNext()) {
            if ((i.nextIndex() + 1) % 2 != 0) {
                temp = i.next();
            } else {
                list1.add(i.next());
                list1.add(temp);
            }
        }
        System.out.println(list1);
    }

}
