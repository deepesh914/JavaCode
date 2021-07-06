package string;

public class CheckNullWapper {

    public static void main(String[] args) {

        Wrapp c = new Wrapp();
        // c.m1(null); --> error
        c.m1(10);
    }

}


class Wrapp {

    public void m1(String s) {
        System.out.println("String");
    }

    public void m1(Integer i) {
        System.out.println("Integer");
    }
}