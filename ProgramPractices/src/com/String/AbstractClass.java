package com.String;

public abstract class AbstractClass extends AB {

    public static void main(String[] args) {

        AB ab = new AbstractClass() {

        };

    }
}


abstract class AB implements I12 {

    public AB() {

    }

    public void m1() {
        System.out.println("Hi");
    }
}


interface I12 {

    public void m1();
}
