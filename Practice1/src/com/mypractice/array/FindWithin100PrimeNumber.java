package com.mypractice.array;

public class FindWithin100PrimeNumber {

    public static void main(String[] args) {
        int num = 2;
        while (num <= 100) {
            boolean isPrime = false;
            for (int i = 2; i < (num / 2); i++) {
                if ((num % i) == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime == false) {
                System.out.print(num + " ");
            }
            num++;
        }

    }

}
