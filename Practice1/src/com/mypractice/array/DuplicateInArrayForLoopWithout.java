package com.mypractice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArrayForLoopWithout {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5 };
        List<Integer> list = Arrays.asList(arr);
        Set<Integer> s = new HashSet<Integer>(list);
        System.out.println("Final Set: " + s);
    }

}
