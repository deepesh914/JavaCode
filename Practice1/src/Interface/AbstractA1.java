package Interface;

abstract class AB {
    public abstract void m1();

    public abstract void m2();
}


public class AbstractA1 extends AB {

    public static void main(String[] args) {
        AbstractA1 a = new AbstractA1();
        a.m1();
        a.m2();
    }

    public final void m1() {
        System.out.println("M1-main class");
    }

    public final void m2() {
        System.out.println("M1-main class");

    }
}


class SubAbs extends AbstractA1 {

}