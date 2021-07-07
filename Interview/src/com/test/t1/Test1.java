package com.test.t1;

public class Test1 {
    // DEEPESH
    // D$E$E$P$E$S$H
    public static void main(String[] args) {

        String s = "DEEPESH";
        String[] split = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i == split.length - 1)
                sb.append(split[i]);
            else
                sb.append(split[i]).append("$");
        }
        System.out.println("Input : " + s);
        System.out.println("Output: " + sb);
    }
}
