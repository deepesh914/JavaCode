package string;

public class ReverseWord {

    public static void main(String[] args) {
        String s = "I live in India";
        String[] split = s.split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
            // System.out.print(split[i]);
            if (i == 0) {
                result += split[i];
            } else {
                result += split[i] + " ";
            }
        }
        System.out.println(result);
    }
}
// India in live I
