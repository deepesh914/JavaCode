package com.mypractice.array;

public class FindTop10PrimeNumber {

    public static void main(String[] args) {

        int count = 1;
        int num = 2;
        boolean isPrime = true;
        System.out.println("Top 10 Prime Number are : ");
        while (count <= 10) {
            for (int i = 2; i <= (num / 2); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;

        }

    }

}
