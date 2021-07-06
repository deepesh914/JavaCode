package string;

import java.util.ArrayList;

public class ParaghraphDemo {

    public static void main(String[] args) {
        String s = "It seems redundant and unnecessary since they are obtaining the object's lock for another thread";
        s = s.toLowerCase();
        String[] split = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            // System.out.println(split[i]);
            list.add(split[i]);
        }
        // Collections.sort(list);
        System.out.println(list);
    }

}
