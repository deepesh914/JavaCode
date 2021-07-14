package java8stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        al.add(25);
        System.out.println("List: " + al);
        // only even numbers
        List<Integer> al1 = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("only Even numbers: " + al1);
        // multiply by 2
        List<Integer> al2 = al.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println("multiply by 2: " + al2);

        Collections.sort(al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));

    }

}
