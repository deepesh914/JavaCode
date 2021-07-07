package com.test.t2;

public class B {

    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.call(3, 4);
        System.out.println(obj.x + " " + obj.y);
        new B().m1();
    }

    public void m1() {
        System.out.println("m1");
    }

}


class ABC {
    public int    x;
    protected int y;

    void call(int a, int b) {
        x = a + 1;
        y = b;
    }
}