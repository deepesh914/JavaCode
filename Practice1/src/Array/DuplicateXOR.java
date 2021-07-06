package Array;

//This works whether array contains any unique count of elements.
public class DuplicateXOR {

    public static void main(String[] args) {
        int[] x = { 1, 2, 1, 2, 2, 3, 3, 3, 3, 2, 1 };
        int number = x[0];
        for (int i = 1; i < x.length; i++) {
            number = number ^ x[i];
        }
        System.out.println("Triplicate Number is " + number);
    }

}
