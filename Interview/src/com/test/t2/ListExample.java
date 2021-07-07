package com.test.t2;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Alice");
        list.add(Boolean.TRUE);
        System.out.println(list);
        list.add(1, "Bob");
        list.add("true");
        System.out.println(list);
        list.remove("true");
        System.out.println(list);
        list.add(1, "Mike");
        list.add(4, "Tara");
        System.out.println(list);
    }

}
