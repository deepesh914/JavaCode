package Interface;

@FunctionalInterface
interface AA {
    public abstract int m1(int a, int b);
}


@FunctionalInterface
interface BB {
    public abstract int m2(int a, int b, int c);
}


public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        BB b1 = (int a, int b, int c) -> a + b + c;
        int res = b1.m2(10, 20, 30);
        System.out.println(res);

        AA a1 = (int a, int b) -> a + b;
        int test = a1.m1(10, 20);
        System.out.println(test);
        // b.m1();
        // b.m2();
    }

}
