package java8stream;

import java.util.ArrayList;

public class ListToArrayStream {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        al.add(25);
        System.out.println("List: " + al);

        Integer[] arr = al.stream().toArray(Integer[]::new);
        for (Integer a : arr) {
            System.out.println(a);
        }
    }

}
