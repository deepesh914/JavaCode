package com.collection;

import java.util.Arrays;

public class SameArray {

    public static void main(String[] args) {

        int[] arr = { 1, 9, 3, 4, 7, 5, 6 };
        arr[1] = arr[0] + arr[1];
        int temp = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            int prev = arr[i];
            arr[i] = temp + arr[i];
            temp = prev;
        }
        System.out.println(Arrays.toString(arr));
    }

}
