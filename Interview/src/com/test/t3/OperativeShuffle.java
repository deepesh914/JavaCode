package com.test.t3;

import java.util.Random;

public class OperativeShuffle {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8, 9 };
        shuffle(arr);
    }

    private static void shuffle(int[] arr) {
        Random r = new Random();
        int a = r.nextInt(5);
        int l = arr.length;
        while (l != 0) {
            int random = (int) Math.abs(Math.random() * 10);
            if (random < arr.length) {
                System.out.print(arr[random] + " ");
                l--;
            }
        }
    }
}
