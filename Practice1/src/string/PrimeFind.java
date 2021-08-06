package string;

import java.util.Scanner;

public class PrimeFind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        checkPrime(i);
    }

    private static void checkPrime(int a) {
        int i = Math.abs(a);
        boolean flag = false;
        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Given num is not prime");
        } else {
            System.out.println("Given num is prime");
        }
    }

}
