package practice;

public class ReverseString {

    public static void main(String[] args) {
        String s = "I Love my INDIA";
        String result = "";

        // for (int i = s.length() - 1; i >= 0; i--) {
        // result = result + s.charAt(i);
        // }
        // o/p: AIDNI ym evoL I

        // String[] split = s.split(" ");
        // for (int i = split.length - 1; i >= 0; i--) {
        // result = result + split[i] + " ";
        // }
        // o/p: INDIA my Love I

        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            String reverse = "";
            for (int j = s1.length() - 1; j >= 0; j--) {
                reverse = reverse + s1.charAt(j);
            }
            result += reverse + " ";
        }
        System.out.println(result);
    }
    // o/p: I evoL ym AIDNI

}
