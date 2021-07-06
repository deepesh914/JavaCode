package Array;

public class FindWithin100PrimeNumber {

    public static void main(String[] args) {
        int no = 2;
        while (no <= 100) {
            boolean flag = false;
            for (int i = 2; i < (no / 2); i++) {
                if ((no % i) == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(no + " ");
            }
            no++;
        }
    }
}
