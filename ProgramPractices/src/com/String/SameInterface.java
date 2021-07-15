package com.String;

public class SameInterface {

    public static void main(String[] args) {
        I1 i1 = new TwoImplements();
        i1.m1();

        I1 i2 = new ThreeImplements();
        i2.m1();
    }

}


class TwoImplements implements I1 {

    public void m1() {
        System.out.println("Two-I1-m1");
    }
}


class ThreeImplements implements I1 {

    public void m1() {
        System.out.println("Three-I1-m1");
    }
}


interface I1 {
    // public int get();

    default void m1() {
        System.out.println("I1-m1");
    }
}


interface I2 {
    // public String get();
}