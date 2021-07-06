package searching.sorting;

public class SearchLinear {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 50, 30, 80 };
        int key = 70;

        System.out.println(key + " Index is: " + findElement(arr, key));
    }

    private static int findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

}
