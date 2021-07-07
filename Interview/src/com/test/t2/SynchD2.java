package com.test.t2;

import java.util.Arrays;

public class SynchD2 {
    public static void main(String[] args) {

        // int[] abc = { 1, 0, 1, 0, 1, 0, 1 };
        int[] abc = { 1, 0, 1, 2, 4, 0, 1, 0, 1, 3 };

        // for (int i = 0; i < abc.length - 1; i++) {
        // for (int j = i + 1; j < abc.length; j++) {
        // if (abc[i] >= abc[j]) {
        // int temp = abc[i];
        // abc[i] = abc[j];
        // abc[j] = temp;
        // }
        // }
        // }

        // Using 1 for-loop
        for (int i = 0; i < abc.length - 1; i++) {
            if (abc[i] > abc[i + 1]) {
                int temp = abc[i];
                abc[i] = abc[i + 1];
                abc[i + 1] = temp;
                i = -1;
            }
        }

        for (int abc1 : abc) {
            System.out.print(abc1);
        }
        System.out.println();
        System.out.println(Arrays.toString(abc));

    }
}
