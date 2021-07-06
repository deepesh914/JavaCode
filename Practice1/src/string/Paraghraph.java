package string;

import java.util.TreeSet;

public class Paraghraph {

    public static void main(String[] args) {
        String s = "It seems redundant and unnecessary since they are obtaining the object's lock for another thread and ";
        s = s.toLowerCase();
        String[] split = s.split(" ");
        TreeSet<String> set = new TreeSet<String>();
        for (int i = 0; i < split.length; i++) {
            set.add(split[i]);
        }
        System.out.println(set);
    }

}
