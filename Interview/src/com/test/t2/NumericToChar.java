package com.test.t2;

public class NumericToChar {

    public static void main(String[] args) {
        String s = "a4k3b2";
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            if (i % 2 == 0) {
                sb = sb.append(c[i]);
            } else {
                int j = c[i - 1];
                int k = Character.getNumericValue(c[i]);
                int res = j + k;
                char ab = (char) res;
                sb = sb.append(ab);
            }
        }
        System.out.println(sb);
    }

}

// i/p->a4k3b2
// o/p->aeknbd