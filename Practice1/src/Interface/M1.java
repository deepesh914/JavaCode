package Interface;

interface I1 {
    public void f1();

    public void f2();

    public default void f3() {
    }

    public static void f4() {
    }
}


interface I2 {
    void f2();
}


class B implements I1, I2 {
    public void f1() {
        System.out.println("I1-B-F1");
    }

    public void f2() {
        System.out.println("I2-B-F2");
    }
}


class C extends B implements I1, I2 {
    public void f1() {
        System.out.println("I1-C-F1");
    }

    public void f2() {
        System.out.println("I2-C-F2");
    }
}


public class M1 extends A {
    public static void main(String[] args) {

        B b = new C();
        b.f1();
        b.f2();
    }

    void f3() {
        System.out.println("f3");
    }
}
