package Constructor;

public class BStatic {

    static Integer i = 10;
    Integer        j = 20;

    public static void main(String[] args) {

        BStatic b = new BStatic();
        i = 30;
        b.j = 40;
        System.out.println(BStatic.i);
        System.out.println(b.i);
        System.out.println(b.j);

    }

    public void m1() {
        Integer k = 30;
    }
}
