package com.test.t2;

public class Test12 {

    public static void main(String[] args) {

        // File f = new File("Abc.txt");
        hack1 h1 = new hack2();
        hack2 h2 = new hack2();
        hack1 h;
        h = h1;
        h.hackmethod();

    }

}


class hack1 {
    hack1() {
        System.out.println("hack1 const");
    }

    void hackmethod() {
        System.out.println("hack 1 method");
    }
}


class hack2 extends hack1 {
    hack2() {
        System.out.println("hack2 const");
    }

    void hackmethod() {
        System.out.println("hack 2 method");
    }
}