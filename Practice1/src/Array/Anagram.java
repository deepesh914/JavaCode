package Array;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        checkAnagram("TALENT", "LATENT");
        checkAnagram("peek", "Keep");
        checkAnagram("Team", "Meet");
        checkAnagram("Mother in Law", "Hitler Woman");
    }

    private static void checkAnagram(String s1, String s2) {
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            status = Arrays.equals(c1, c2);
        }
        if (status == true)
            System.out.println(s1 + " and " + s2 + " are anagram");
        else
            System.out.println(s1 + " and " + s2 + " are not anagram");
    }
}
