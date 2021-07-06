package java8lambda;

import java.util.TreeMap;

public class TreeMapLambda {

    public static void main(String[] args) {
        TreeMap<Integer, String> al = new TreeMap<Integer, String>();
        al.put(100, "Deep");
        al.put(600, "Sunny");
        al.put(300, "Bunny");
        al.put(200, "Ravi");
        al.put(700, "Neha");
        al.put(400, "Deepesh");
        System.out.println("Before sorting: " + al);
        // TreeMap<Integer, String> tm = new TreeMap<Integer, String>((I1, I2) -> I1 > I2 ? -1 : I1 < I2 ? 1 : 0);
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>((I1, I2) -> -I1.compareTo(I2));
        tm.put(100, "Deep");
        tm.put(600, "Sunny");
        tm.put(300, "Bunny");
        tm.put(200, "Ravi");
        tm.put(700, "Neha");
        tm.put(400, "Deepesh");
        System.out.println("After sorting: " + tm);
        TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>();
        tm1.put("Deep", 100);
        tm1.put("Sunny", 600);
        tm1.put("Bunny", 300);
        tm1.put("Ravi", 200);
        tm1.put("Neha", 700);
        tm1.put("Deepesh", 400);
        System.out.println("Before sorting based on name: " + tm1);
        TreeMap<String, Integer> tm2 = new TreeMap<String, Integer>((s1, s2) -> -(s1.compareTo(s2)));
        tm2.put("Deep", 100);
        tm2.put("Sunny", 600);
        tm2.put("Bunny", 300);
        tm2.put("Ravi", 200);
        tm2.put("Neha", 700);
        tm2.put("Deepesh", 400);
        System.out.println("After sorting based on name: " + tm2);
    }

}
