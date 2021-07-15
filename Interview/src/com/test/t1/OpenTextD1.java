package com.test.t1;

import java.util.Arrays;

public class OpenTextD1 {

    public static void main(String[] args) {

        int[] arr = { 3, 4, 6, 7, 8, 2, 9, 10 };
        int sum = 10;
        // 10/2 = 5;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }

        System.out.println(Arrays.toString(arr)); // {2,3,4,6,7,8,9,10}

        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            int diff = sum - a;
            int j = i;
            while (j < arr.length - 1) {
                if (diff == arr[j + 1]) {
                    System.out.println(a + " , " + arr[j + 1]);
                    break;
                }
                j++;
            }

            // for(int j=i+1; j<arr.length;j++) {
            // if(diff == arr[j]) {
            // System.out.println(a+" , "+ arr[j]);
            // }
            // }
        }

    }

}
