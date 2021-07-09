package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListSorted {

    public static void main(String[] args) {
        // {1,2,3,4,2,4,5,6,3,7}
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(7);
        list.stream().filter(i -> i >= 3).distinct().forEach(System.out::println);
    }

}
