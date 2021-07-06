package com.mypractice.array;

public class DuplicateInArrayWithoutCollection {

    public static void main(String[] args) {

        int[] a = { 1, 3, 4, 5, 6, 3, 2, 5, 6, 7, 8 };
        int[] result = new int[a.length];

        // Arrays.sort(a);
        // sort using one for loop
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
                i = 0;
            }
        }

        result[0] = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[i]) {
                result[i] = a[i];
            }
        }
        System.out.println();
        System.out.println("Result array");
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                continue;
            }
            System.out.print(result[i] + ",");
        }
    }

}
