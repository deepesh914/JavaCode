package java8stream;

import java.util.ArrayList;

public class ListForEachStream {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Deepesh");
        al.add("Rakesh");
        al.add("Rameshwar");
        al.add("Rajeshwar");
        al.add("Rajni");
        al.add("Deepak");
        System.out.println("List: " + al);
        System.out.println("-----------------------------");
        al.stream().forEach(s -> System.out.println(s));
        // OR
        System.out.println("-----------------------------");
        al.stream().forEach(System.out::println);

    }

}
