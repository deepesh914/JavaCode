package com.Interview;

import java.util.Arrays;

public class PythagoreanTriplet {

    static void findTriplet(int arr[], int n) {
        // Step1
        for (int i = 0; i < n; i++) {
            // System.out.println("Before " + arr[i]);
            arr[i] = arr[i] * arr[i];
            // System.out.println("After " + arr[i]);
        }

        // int arr[] = { 9, 1, 16, 36, 25 };
        Arrays.sort(arr);
        // int arr[] = { 1, 9, 16, 25, 36 };
        // n= 5
        // Step2 and Step 3
        for (int i = n - 1; i >= 2; i--) { // Fix a
            int b = 0; // Fix b
            int c = i - 1; // Fix c
            while (b < c) {
                // A triplet found
                System.out.println(arr[b] + " " + arr[c]);
                if (arr[b] + arr[c] == arr[i]) {
                    System.out.printf("Triplets: %s, %s, %s\n", new Object[] { Math.sqrt(arr[b]), Math.sqrt(arr[c]), Math.sqrt(arr[i]) });
                    b++;
                    c--;
                }
                if (arr[b] + arr[c] < arr[i])
                    b++;
                else
                    c--;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 6, 5 };
        int arr_size = arr.length;
        findTriplet(arr, arr_size);
    }
}
