package Interface;

interface M23 {
    public void m1();

    default void m2() {
        System.out.println("M2-Interface");
    }

    default void m3() {
        System.out.println("M3-Interface");
    }
}


class M22 implements M23 {

    @Override
    public void m1() {
        System.out.println("M1-Main class");

    }

    /*
     * public void m2(){ System.out.println("M2-Main class"); } public void m3(){ System.out.println("M3-Main class"); }
     */

}


public class M12 {

    public static void main(String[] args) {
        M22 m = new M22();
        m.m1();
        m.m2();
        m.m3();
    }

}
