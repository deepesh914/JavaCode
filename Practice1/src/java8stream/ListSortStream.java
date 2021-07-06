package java8stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortStream {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        al.add(25);
        System.out.println("List: " + al);

        List<Integer> al1 = al.stream().sorted().collect(Collectors.toList());
        System.out.println("Natural sorting: " + al1);

        List<Integer> al2 = al.stream().sorted((i1, i2) -> (i1 > i2 ? -1 : (i1 < i2) ? 1 : 0)).collect(Collectors.toList());
        System.out.println("Customized sorting: " + al2);
        // OR
        List<Integer> al3 = al.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Customized sorting: " + al3);
        // OR
        List<Integer> al4 = al.stream().sorted((i1, i2) -> (i2.compareTo(i1))).collect(Collectors.toList());
        System.out.println("Customized sorting: " + al4);
    }

}
