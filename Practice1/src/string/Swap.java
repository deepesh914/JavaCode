package string;

public class Swap {

    public static void main(String[] args) {
        String s = "Rakesh";
        if (s.toLowerCase().matches(".*[aeiou].*")) {
            System.out.println("Vowel present");
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                System.out.println(s.charAt(i) + " present at index: " + i);
            }
        }

        // char[] c = s.toLowerCase().toCharArray();
        // for (char c1 : c) {
        // if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
        // System.out.println(c1);
        // }
        // }
    }
}
