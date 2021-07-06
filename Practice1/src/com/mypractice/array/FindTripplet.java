package com.mypractice.array;

public class FindTripplet {

    public static void main(String[] args) {

        int[] x = { 1, 1, 2, 2, 3, 3, 3, 3, 4 };
        int value = x[0];
        for (int i = 1; i < x.length; i++) {
            value = value ^ x[i];
        }
        System.out.println(value);
    }

}
