package com.test.t2;

import java.util.Arrays;

public class Veri1 {

    public static void main(String[] args) {

        String s = "10101110110110001";
        StringBuilder res = new StringBuilder();
        char[] c = s.toCharArray();
        // for (int i = 0; i < c.length; i++) {
        // if (c[i] == '1') {
        // res = res.append(c[i]);
        // }
        // }
        // int length = s.length() - res.length();
        // for (int j = 0; j < length; j++) {
        // res = res.append("0");
        // }
        // System.out.println(res);

        Arrays.sort(c);
        for (int k = c.length - 1; k >= 0; k--)
            System.out.print(c[k]);

        // Collections.sort();

    }
}
// input - 10101110110110001
// output - 11111111110000000