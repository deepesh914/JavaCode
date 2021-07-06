package searching.sorting;

import java.util.Arrays;

public class SearchBinary {

    public static void main(String[] args) {
        int[] arr = { 10, 30, 20, 40, 90, 70, 50 };
        int key = 100;
        Arrays.sort(arr);
        checkElement(arr, 0, arr.length - 1, key);

    }

    private static void checkElement(int[] arr, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else if (arr[mid] > key) {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}
