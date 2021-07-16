package com.test.t1;

import java.util.ArrayList;

public class OpenText_D3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        System.out.println(list.size());
        list.remove(10); // java.lang.IndexOutOfBoundsException:
        System.out.println(list);

    }
}
