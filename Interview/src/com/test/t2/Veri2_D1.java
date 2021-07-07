package com.test.t2;

public class Veri2_D1 {

    public static void main(String[] args) {
        String a = "abc";
        StringBuffer b = new StringBuffer("abc");
        int c = 10;
        test2(a, b, c);
        System.out.println("Main method: " + a + " " + b + " " + c);
    }

    private static void test2(String p, StringBuffer q, int r) {
        p = p + "xyz";
        // p = p.concat("xyz");
        q = q.append("xyz");
        r = r + 40;
        System.out.println("Test Method: " + p + " " + q + " " + r);
    }

}
