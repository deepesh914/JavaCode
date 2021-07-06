package Array;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] x = { 2, 5, 4, 7, 9, 1, 6, 3, 8, 8, 7, 9 };
        // int[] x = {2};
        int length = x.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        if (length < 2) {
            System.out.println("No second element present in array");
            return;
        }

        for (int i = 0; i < x.length; i++) {
            if (first < x[i]) {
                second = first;
                first = x[i];
            } else if (second < x[i] && first != x[i]) {
                second = x[i];
            }
        }

        // OR
        /*
         * int i=0; do{ if(first<x[i]){ second = first; first = x[i]; } else if (second<x[i] && first!=x[i]){ second = x[i]; } i++;
         * }while(i<x.length);
         */

        System.out.println("Second highest element is : " + second);
    }

}
