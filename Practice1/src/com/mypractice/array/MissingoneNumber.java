package com.mypractice.array;

public class MissingoneNumber {

    public static void main(String[] args) {

        int[] x = { 1, 2, 4, 5, 7, 6 };
        int n = x.length + 1;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        int numberSum = n * (n + 1) / 2;
        System.out.println(numberSum - sum);
    }

}
