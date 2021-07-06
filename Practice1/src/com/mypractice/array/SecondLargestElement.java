package com.mypractice.array;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] x = { 1, 3, 5, 2, 4, 8, 7, 9, 11, 23, 23, 11, 13, 25 };
        int first = x[0];
        int second = Integer.MIN_VALUE;
        if (x.length <= 1) {
            System.out.println("No second element present");
            return;
        }
        for (int i = 1; i < x.length; i++) {
            if (first < x[i]) {
                second = first;
                first = x[i];
            } else if (second < x[i] && first != x[i]) {
                second = x[i];
            }
        }
        System.out.println("Second Largest number is : " + second);
    }

}
