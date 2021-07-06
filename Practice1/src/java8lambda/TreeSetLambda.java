package java8lambda;

import java.util.TreeSet;

public class TreeSetLambda {

    public static void main(String[] args) {
        TreeSet<Integer> al = new TreeSet<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        al.add(25);
        System.out.println("Before sorting: " + al);
        TreeSet<Integer> ts = new TreeSet<Integer>((I1, I2) -> I1 > I2 ? -1 : I1 < I2 ? 1 : 0);
        ts.add(10);
        ts.add(0);
        ts.add(15);
        ts.add(5);
        ts.add(20);
        ts.add(25);
        System.out.println("After sorting: " + ts);

    }

}
