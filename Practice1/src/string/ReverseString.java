package string;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String s = "I Love My Country";

        char[] c = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char c1 : c) {
            st.push(c1);
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }

        // StringBuilder sb = new StringBuilder(s);
        // System.out.println(sb.reverse());
        //
        // String res = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        // res += s.charAt(i);
        // }
        // System.out.println(res.toString());
    }

}
