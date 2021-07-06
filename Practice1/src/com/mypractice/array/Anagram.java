package com.mypractice.array;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        checkAnagram("Keep", "Peek");
        checkAnagram("TALENT", "LATENT");
    }

    private static void checkAnagram(String s1, String s2) {
        boolean status = false;
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        if (s1.length() != s2.length())
            status = false;
        else {
            Arrays.sort(c1);
            Arrays.sort(c2);
            status = Arrays.equals(c1, c2);
        }

        if (status)
            System.out.println(s1 + " and " + s2 + " both are anagram");
        else
            System.out.println(s1 + " and " + s2 + " both are not anagram");
    }

}
