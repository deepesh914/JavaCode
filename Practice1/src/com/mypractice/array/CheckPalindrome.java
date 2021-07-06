package com.mypractice.array;

public class CheckPalindrome {

    private static String maxString = "";

    public static void main(String[] args) {
        String s = "BANANA";
        for (int i = 0; i < s.length(); i++) {
            checkPalindrome(s.substring(i, s.length()));
        }
        System.out.println("Max Palindrome String is: " + maxString);
    }

    private static void checkPalindrome(String s) {
        for (int i = 1; i <= s.length(); i++) {
            StringBuilder sb1 = new StringBuilder(s.substring(0, i));
            StringBuilder sb2 = new StringBuilder(s.substring(0, i));
            sb2.reverse();

            if (sb1.toString().equals(sb2.toString())) {
                if (maxString.length() <= sb1.length()) {
                    maxString = sb1.toString();
                }
            }
        }
    }

}
