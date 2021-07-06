package com.collection;

class AB extends D {
    public static void main(String[] args) {
        System.out.println("AB");
    }

    public final void m1() {

    }

}


class E extends AB {
    public static void main(String[] args) {
        System.out.println("E");
    }

}


class D {

    public void m1() {

    }

    public final void m2() {
        // TODO Auto-generated method stub

    }
}
