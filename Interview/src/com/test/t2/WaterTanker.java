package com.test.t2;

import java.util.Arrays;

public class WaterTanker {

    public static void main(String[] args) {
        int n = 3;
        int[] cap = { 4, 4, 4 };
        int[] water = { 2, 2, 10 };

        int c = solve(n, cap, water);
        System.out.println("Total tanker: " + c);
    }

    private static int solve(int n, int[] C, int[] W) {
        int count = 0;
        Arrays.sort(C); // {4,5,5}

        int usedwater = 0;
        for (int i = 0; i < W.length; i++) {
            usedwater += W[i];
        }

        for (int i = C.length - 1; i >= 0; i--) {
            // System.out.println(totalCap[i]);
            if (C[i] >= usedwater) { // 5>=6 5>=1
                count++; // 2
                break;
            } else {
                usedwater = usedwater - C[i]; // 6-5 = 1
                count++; // 1
            }

        }
        return count;
    }

}
