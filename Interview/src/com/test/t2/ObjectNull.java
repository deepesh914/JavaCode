package com.test.t2;

public class ObjectNull {

    public static void main(String[] args) {

        A a = new A();
        a.m1("null"); // string
        // a.m1(null); // object

    }

}


class A {

    public void m1(Object o) {

        System.out.println("object");

    }

    public void m1(String s) {

        System.out.println("string");

    }

    public void m1(StringBuffer sb) {

        System.out.println("StringBuffer");

    }

}