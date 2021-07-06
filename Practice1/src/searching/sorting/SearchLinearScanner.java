package searching.sorting;

import java.util.Scanner;

public class SearchLinearScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        for (int j = 0; j < n; j++) {
            if (arr[j] == key) {
                System.out.println(key + " index found in : " + j);
                return;
            }
        }
        System.out.println(key + " index value not found");

    }

}
