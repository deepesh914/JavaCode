package Array;

public class Test {

    static int i = 10;
    int        j = 20;

    public static void main(String[] args) {
        int[] x = new int[5];
        // x.length = 10;
        System.out.println(x.length);
        System.out.println(i);

        final Test t = new Test();
        // t = null;
        Test t1 = new Test();
        t1 = null;
        System.out.println(t.j);
    }

}
