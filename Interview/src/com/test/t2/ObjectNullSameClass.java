package com.test.t2;

public class ObjectNullSameClass {

    public void m1(Object o) {

        System.out.println("object");

    }

    public void m1(String s) {

        System.out.println("string");

    }

    public static void main(String[] args) {

        ObjectNullSameClass a = new ObjectNullSameClass();

        a.m1("null"); // string

        a.m1(null); // String
    }

}
