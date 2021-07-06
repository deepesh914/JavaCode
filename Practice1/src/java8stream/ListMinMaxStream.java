package java8stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

// pre-requisite list should be in sorted order
public class ListMinMaxStream {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        al.add(25);
        System.out.println("List: " + al);
        Integer min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Minimum value: " + min);

        Integer max = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Maximum value: " + max);

        LinkedList<Integer> l = new LinkedList<>();

        Map<Integer, String> h = new HashMap<>();

        Hashtable<Integer, String> ht = new Hashtable<>();

        HashSet<Integer> hs = new HashSet<>();
    }

}
