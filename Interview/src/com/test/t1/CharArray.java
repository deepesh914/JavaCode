package com.test.t1;

import java.util.HashMap;

public class CharArray {

    public static void main(String[] args) {

        charNum("Javaj2Ee");

    }

    private static void charNum(String string) {

        char[] strArray = string.toCharArray();
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();

        for (char c : strArray) {
            if (h.containsKey(c)) {
                h.put(c, h.get(c) + 1);
            } else {
                h.put(c, 1);
            }
        }
        System.out.println(h);
    }

}
