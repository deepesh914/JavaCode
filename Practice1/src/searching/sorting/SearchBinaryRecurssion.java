package searching.sorting;

import java.util.Arrays;

public class SearchBinaryRecurssion {

    public static void main(String[] args) {
        int[] arr = { 10, 30, 20, 40, 90, 70, 50 };
        int key = 50;
        Arrays.sort(arr);
        int result = checkElement(arr, 0, arr.length - 1, key);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found in : " + result);

    }

    private static int checkElement(int[] arr, int first, int last, int key) {
        if (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                return checkElement(arr, first, mid - 1, key);
            } else {
                return checkElement(arr, mid + 1, last, key);
            }
        }

        return -1;
    }

}
