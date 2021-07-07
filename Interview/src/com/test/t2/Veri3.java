package com.test.t2;

public class Veri3 {

    public static void main(String[] args) {
        String s = "DEEPESH GUPTA";
        String res = "";
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            // StringBuilder s1 = new StringBuilder();
            String s2 = "";
            char[] c = split[i].toCharArray();
            for (int j = c.length - 1; j >= 0; j--) {
                s2 += c[j];
                // s1.append(c[j]);
            }
            // res = res + s1 + " ";
            res = res + s2 + " ";
        }
        System.out.println(res);
    }

}
// input - DEEPESH GUPTA
// output - HSEPEED ATPUG