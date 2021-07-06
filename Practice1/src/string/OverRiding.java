package string;

// Polymorphism concept
public class OverRiding {

    public static void main(String[] args) {
        A a = new B();
        // final B b = new B();
        // A a1 = b;
        a.m1();
        // a.m2();
        // a.m2();
        // a1.m1();
    }
}


class A {
    // private A() throws Exception {
    // }

    public void m1() {
        System.out.println("A-M1");
    }

    public static void m3() {
        System.out.println("A-m3");
    }
}


class B extends A {
    // public B() throws Exception {
    // super();
    // }

    public void m1() {
        super.m1();
        System.out.println("B-M1");
    }

    public static void m2() {
        System.out.println("B-M2");
    }

    // public void m3() {
    // System.out.println("B-M3");
    // }

    // private static void m3() {
    // System.out.println("B-M3");
    // }
}