package com.mypractice.array;

public class FindParticularPrimeNumber {

    public static void main(String[] args) {
        int num = 17;
        boolean status = false;
        for (int i = 2; i < (num / 2); i++) {
            if ((num % i) == 0) {
                status = true;
            }
        }
        if (status) {
            System.out.println(num + " is not a prime number");
        } else {
            System.out.println(num + " is a prime number");
        }
    }

}
