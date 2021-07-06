package string;

public class ReverseWordOnly {

    public static void main(String[] args) {
        String s = "My am living in India";
        String[] split = s.split(" ");
        String result = "";
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            String reverse = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse += word.charAt(j);
            }
            result += reverse + " ";
        }
        System.out.println(s);
        System.out.println(result);
    }

}
// My am living in India
// yM ma gnivil ni aidnI