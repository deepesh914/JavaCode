package string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountAll {

    public static void main(String[] args) {
        String str = "abcdabcdac hdfgt jthg";
        str = str.replace(" ", "");
        Map<Character, Integer> numChars = new HashMap<Character, Integer>();

        /*
         * for (int i = 0; i < str.length(); ++i) { char charAt = str.charAt(i); if (!numChars.containsKey(charAt)) { numChars.put(charAt,
         * 1); } else { numChars.put(charAt, numChars.get(charAt) + 1); } }
         */

        for (char c : str.toCharArray()) {
            if (numChars.containsKey(c)) {
                numChars.put(c, numChars.get(c) + 1);
            } else {
                numChars.put(c, 1);
            }
        }

        System.out.println(numChars);
        List<Integer> list = new LinkedList<Integer>();
        Set<Map.Entry<Character, Integer>> set = numChars.entrySet();
        for (Map.Entry<Character, Integer> value : set) {
            list.add(value.getValue());
        }
        System.out.println(list);

    }

}
