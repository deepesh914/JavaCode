package DecimalConversions;

public class Solution {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int[] a = new int[n];
        // for(int a_i=0; a_i < n; a_i++){
        // a[a_i] = in.nextInt();
        // }
        // Write Your Code Here
        int[] a = { 3, 2, 1, 4, 8, 7, 9, 5 };
        int x = 0;
        /*
         * for (int i = 0; i < a.length; i++) { for (int j = i + 1; j < a.length; j++) { if (a[i] > a[j]) { x++; int swap = a[i]; a[i] =
         * a[j]; a[j] = swap; } } }
         */

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
                i = 0;
                x++;
            }
        }

        int first = a[0];
        int last = a[a.length - 1];
        System.out.println("Array is sorted in " + x + " swaps.");
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);
    }
}