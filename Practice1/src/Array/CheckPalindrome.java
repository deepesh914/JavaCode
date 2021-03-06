package Array;

public class CheckPalindrome {

    private static String max_string = "";

    public static void checkSubString(String s) {
        // System.out.println("Got string is " + s);

        for (int i = 1; i <= s.length(); i++) {
            StringBuilder s1 = new StringBuilder(s.substring(0, i));
            StringBuilder s2 = new StringBuilder(s.substring(0, i));
            s2.reverse();
            if (s1.toString().equals(s2.toString())) {
                if (max_string.length() <= s1.length()) {
                    max_string = s1.toString();
                }
            }
        }

    }

    public static void main(String[] args) {
        String s = "BANANA";

        for (int i = 0; i < s.length(); i++)
            checkSubString(s.substring(i, s.length()));

        System.out.println("Max string is " + max_string);
    }
}