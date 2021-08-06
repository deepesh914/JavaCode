package searching.sorting;

public class SortSelectionExample {

    public static void main(String[] args) {

        int[] arr = { 9, 14, 3, 2, 43, 11, 58, 22 };

        System.out.println("Before Selection Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr);// sorting array using selection sort

        System.out.println("After Selection Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallNumber = arr[i];
            arr[i] = arr[index];
            arr[index] = smallNumber;
        }
    }
}

/*
 * Time Complexity: O(n2) as there are two nested loops. Auxiliary Space: O(1) The good thing about selection sort is it never makes more
 * than O(n) swaps and can be useful when memory write is a costly operation.
 */
