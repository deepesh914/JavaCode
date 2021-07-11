package com.collection;

import java.util.Scanner;

public class MinDelete {

    public static int minStep(String str) {

        int charA = 'A';
        int numY = 0;
        int minDel = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charA == str.charAt(i)) {
                minDel = Math.min(numY, minDel + 1);
            } else {
                numY++;
            }
        }
        return minDel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(minStep(str));
        // BAAABAB
    }

}
