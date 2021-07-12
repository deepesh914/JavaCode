package com.collection;

import java.util.Arrays;

public class ArrangeValue {

    // [0,0,0,1,3,4,3,7]
    public static void main(String[] args) {
        int[] arr = { 3, 3, 0, 4, 3, 0, 0, 7 };
        int[] result = new int[arr.length];
        int count = 0;
        int minValue = findMinValue(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minValue = arr[i];
                result[count] = arr[i];
                count++; // 3
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if ((arr[j] == minValue))
                continue;
            else {
                result[count] = arr[j];
                count++;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    private static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

}
