package java8stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListCountStream {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Deepesh");
        al.add("Rakesh");
        al.add("Rameshwar");
        al.add("Rajeshwar");
        al.add("Rajni");
        al.add("Deepak");
        System.out.println("Full List: " + al);
        // name start with 'D'
        List<String> sName = al.stream().filter(i -> i.startsWith("R")).collect(Collectors.toList());
        System.out.println("Start name with List: " + sName);
        // check length
        List<String> st = al.stream().filter(s -> s.length() >= 8).collect(Collectors.toList());
        System.out.println(st);
        // count
        long count = al.stream().filter(s -> s.length() >= 8).count();
        System.out.println(count);

    }

}
