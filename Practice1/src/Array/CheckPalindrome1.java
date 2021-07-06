package Array;

public class CheckPalindrome1 {

	public static void main(String[] args) {
		 String s = "BANANA";
		 for (int i = 0; i < s.length(); i++) {
			checkLargestPalindrome(s.substring(i, s.length()));
		}
		 System.out.println(max_String);
	}

	private static String max_String = "";
	
	private static void checkLargestPalindrome(String s) {
		for (int i = 1; i <=s.length(); i++) {
			StringBuilder sb1 = new StringBuilder(s.substring(0, i));
			StringBuilder sb2 = new StringBuilder(s.substring(0, i));
			sb2.reverse();
			if(sb1.toString().equals(sb2.toString())){
				if(sb1.length()>=max_String.length()){
					max_String = sb1.toString();
				}
			}
		}

	}
}
