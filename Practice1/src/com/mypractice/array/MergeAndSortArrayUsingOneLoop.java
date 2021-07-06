package com.mypractice.array;

public class MergeAndSortArrayUsingOneLoop {

    public static void main(String[] args) {
        int[] a = { 5, 4, 8, 9, 6 };
        int[] b = { 3, 1, 2, 0, 7, 13 };
        int[] c = new int[a.length + b.length];

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            c[count++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[count++] = b[i];
        }

        System.out.println("Before sorting");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] > c[i]) {
                int temp = c[i - 1];
                c[i - 1] = c[i];
                c[i] = temp;
                i = 0;
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

}
