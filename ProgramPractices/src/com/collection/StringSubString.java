package com.collection;

import java.util.HashSet;
import java.util.Set;

public class StringSubString {

    public static void main(String[] args) {
        String s = "zyzyzyz";
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                set.add(str);
            }
        }
        System.out.println(set);

        Set<String> newSet = new HashSet<String>();
        for (String s1 : set) {
            StringBuilder sb = new StringBuilder(s1);
            sb.reverse();
            if (s1.length() > 1 && s1.equalsIgnoreCase(sb.toString())) {
                newSet.add(s1);
            }
        }
        System.out.println("\n\n" + newSet);
    }

}
