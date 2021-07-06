package com.collection;

abstract class AbstarctClass {

    public static void m1() {
        System.out.println("Abstract-M1");
    }

    public static void m2() {
        System.out.println("Abstract-M2");
    }

    public static void m3() {
        System.out.println("Abstract-M3");
    }

}


class A extends AbstarctClass {

    // public void m1() {
    // System.out.println("A-M1");
    // }

    public static void m2() {
        System.out.println("A-M2");
    }

    public static void m3() {
        System.out.println("A-M3");
    }

}


public class AbstractExtendClass {
    public static void main(String[] args) {
        A a = new A();
        A.m2();
        AbstarctClass.m2();
        a.m1();
        a.m2();
        a.m3();

        // try {
        // int i = 10 / 0;
        // } catch (ArithmeticException | IndexOutOfBoundsException e) {
        // e.printStackTrace();
        // }
    }
}
