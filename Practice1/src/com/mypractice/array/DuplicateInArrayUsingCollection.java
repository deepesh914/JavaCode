package com.mypractice.array;

import java.util.HashSet;

public class DuplicateInArrayUsingCollection {

    public static void main(String[] args) {

        int[] x = { 1, 2, 2, 3, 4, 5, 4, 6 };
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int a : x) {
            hs.add(a);
        }
        System.out.println(hs);
    }

}
