package searching.sorting;

public class SortBubble {

    public static void main(String[] args) {

        int[] arr = { 3, 60, 35, 2, 45, 320, 5 };

        System.out.println("Array before sorting: ");
        for (int a : arr)
            System.out.print(a + " ");

        bubbleSort(arr);
        System.out.println();

        System.out.println("Array after sorting: ");
        for (int a : arr)
            System.out.print(a + " ");

    }

    private static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] < arr[i - 1]) {
        // int temp = arr[i];
        // arr[i] = arr[i - 1];
        // arr[i - 1] = temp;
        // i = 0;
        // }
        // }
    }
}
/*
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted. Best Case Time Complexity: O(n). Best
 * case occurs when array is already sorted. Auxiliary Space: O(1)
 */
