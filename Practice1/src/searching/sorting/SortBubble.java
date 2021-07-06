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
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i = 0;
            }
        }
    }

}
