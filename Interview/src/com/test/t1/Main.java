package com.test.t1;

public class Main {

    public static void main(String[] args) {
        E b = new F();

    }

}


class D {
    {
        System.out.println("D");
    }
}


class E extends D {
    {
        System.out.println("E");
    }
}


class F extends E {
    {
        System.out.println("F");
    }
}
