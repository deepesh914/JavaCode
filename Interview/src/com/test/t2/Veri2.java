package com.test.t2;

public class Veri2 {

    public static void main(String[] args) {

        String s = "$@#DEE?*)&)(*PES!#@H";
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        String s2 = s.replaceAll("[a-zA-Z0-9]", "");
        String s3 = s.replaceAll("[^$a-zA-Z0-9]", "");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
// input - $@#DEE?*)&)(*PES!#@H
// output - DEEPESH