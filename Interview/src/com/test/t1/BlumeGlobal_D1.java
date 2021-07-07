package com.test.t1;

class A {
    void m1() {
        System.out.println("In m1 A");
    }
}


class B extends A {
    void m1() {
        System.out.println("In m1 B");
    }

    void m2() {
        System.out.println("In m2 B");
    }
}


public class BlumeGlobal_D1 {

    public static void main(String[] args) {
        A a = new B();
        a.m1(); // In m1 B

        A a1 = new B();
        System.out.println(a);
        System.out.println(a1);

        if (a == a1)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
