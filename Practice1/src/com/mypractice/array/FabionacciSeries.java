package com.mypractice.array;

public class FabionacciSeries {

    public static void main(String[] args) {

        int count = 0;
        int i = 0, j = 1;
        int sum = 0;
        while (count <= 20) {
            System.out.print(i + " ");
            sum = i + j;
            i = j;
            j = sum;
            count++;
        }
    }
}
