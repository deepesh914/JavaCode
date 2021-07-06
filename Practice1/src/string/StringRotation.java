package string;

public class StringRotation {

    public static void main(String[] args) {

        String s1 = "ABCDE";
        String s2 = "CDEAB";

        if (Rotation(s1, s2)) {
            System.out.println("First string is rotation of this second string");
        } else {
            System.out.println("First string is not rotation of this second string");
        }
    }

    private static boolean Rotation(String s1, String s2) {
        return ((s1.length() == s2.length()) && ((s1 + s1).indexOf(s2)) != -1);
    }

    // public static boolean Rotation(String str1, String str2) {
    // return (((str1 + str1).indexOf(str2)) != -1 && str1.length() == str2.length());
    // }

}
