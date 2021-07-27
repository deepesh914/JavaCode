package com.test.t3;

//12 10

public class OperativeSwap {

    public static void main(String[] args) {
        int a = 10, b = 12;
        System.out.println(a + " " + b);

        b = b + a;// 22
        a = b - a;// 12
        b = b - a;// 10

        System.out.println(a + " " + b);

    }

}
