package com.String;

interface FI1 {

    public void get();

    default void m1() {
        System.out.println("Hi-m1");
    }

    static void m2() {
        System.out.println("Hi-m2");
    }
}


public class ABC implements FI1 {

    // FI1 i1 = () -> System.out.println("Hi");
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.m1();
        abc.get();
        FI1.m2();
    }

    @Override
    public void get() {
        System.out.println("Get");
    }

}