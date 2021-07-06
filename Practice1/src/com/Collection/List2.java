package com.Collection;

import java.util.LinkedList;

public class List2 {

    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<Object>();
        list.add("Aditya");
        list.add("Deepu");
        list.add('1');
        list.add("Deepu");

        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("INDIA");
        l1.add("USA");

        // list.addAll(l1);
        list.addFirst("null");
        list.addLast("Kishan");

        // System.out.println(list.clone());

        // System.out.println(list.isEmpty());

        for (Object s1 : list) {
            System.out.println(s1);
        }

        // Iterator itr1 = list.iterator();
        //
        // while(itr1.hasNext()){
        // System.out.println(itr1.next());
        // }

    }

}
