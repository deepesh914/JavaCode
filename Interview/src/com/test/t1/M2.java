package com.test.t1;

public class M2 {

    public static void main(String[] args) {

        int[] arr = new int[] { 17, 10, 15, 6, 1 };

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Second largest: " + arr[arr.length - 2]);
    }

}
