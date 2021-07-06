package Array;

// Removing duplicate in Array w/o collection
import java.util.Arrays;

public class DuplicateInArrayWithoutCollection {

    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5, 6, 3, 2, 5, 6, 7, 8 };
        int[] result = new int[a.length];

        Arrays.sort(a);
        // only printing array values after sorting
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1)
                System.out.println(a[i]);
            else
                System.out.print(a[i] + ",");
        }

        result[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                result[i] = a[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                continue;
            }
            if (i == result.length - 1)
                System.out.println(result[i]);
            else
                System.out.print(result[i] + ",");
        }
    }

}
