package com.test.t3;

public class EGapTest {

    public static void main(String[] args) {
        int[] x = { 2, 5, 7, 12, 6, 9, 10 };
        // Arrays.sort(x);
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] > x[i + 1]) {
                int temp = x[i];
                x[i] = x[i + 1];
                x[i + 1] = temp;
            }
        }

        int y = x[x.length - 2];
        System.out.println(y);
    }

}
