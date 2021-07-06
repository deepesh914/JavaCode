package searching.sorting;

public class SortInsertionExample {

    public static void main(String[] args) {
        int[] arr = { 9, 14, 3, 2, 43, 11, 58, 22 };
        System.out.println("Before Insertion Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr);// sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int key = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = key;
                j = j - 1;
            }
        }
    }
}
