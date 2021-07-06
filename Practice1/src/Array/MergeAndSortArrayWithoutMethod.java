package Array;

//Merge two arrays and sort it.
public class MergeAndSortArrayWithoutMethod {

    public static void main(String[] args) {

        int[] a = new int[] { 2, 4, 6, 7, 0 };
        int[] b = new int[] { 1, 3, 5, 8, 9 };
        int[] c = new int[a.length + b.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            c[count++] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }

        System.out.println("Before sorting");

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        System.out.println("After sorting");

        int temp;
        // for (int i = 0; i < c.length; i++) {
        // for (int j = i + 1; j < c.length; j++) {
        // if (c[i] > c[j]) {
        // temp = c[i];
        // c[i] = c[j];
        // c[j] = temp;
        // }
        // }
        // }
        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] > c[i]) {
                temp = c[i - 1];
                c[i - 1] = c[i];
                c[i] = temp;
                i = 0;
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

}

/*
 * Before sorting 2 4 6 7 0 1 3 5 8 9 After sorting 0 1 2 3 4 5 6 7 8 9
 */
