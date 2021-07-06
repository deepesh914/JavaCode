package Constructor;

abstract class T {
    public T() {
        System.out.println("Abstract T Constructor");
    }

    public abstract void m1();

    public abstract void m2();

    public void m3() {
        System.out.println("m3-method");
    }
}


abstract class V {
    public V() {
        System.out.println("Abstract V Constructor");
    }

    public abstract void m1();

    public abstract void m2();
}


final class U extends T {
    public U() {
        System.out.println("U Constructor");
    }

    public void m1() {
        System.out.println("m1-method");
    }

    public void m2() {
        System.out.println("m2-method");
    }

    public void m3() {
        System.out.println("m3-U-method");
    }
}


public class AbstractClass {

    public static void main(String[] args) {
        // U u = new U();
        T t = new U();
        t.m3();
    }
}
/*
 * O/p: Abstract T Constructor U Constructor m3-method
 */