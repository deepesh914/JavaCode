package com.test.t3;

import java.util.Arrays;

public class OperativeInsertionSort {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 2, 1, 7 };
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
