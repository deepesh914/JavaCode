package string;

public class ReverseSimple {

	public static void main(String[] args) {
		String s = "I Love my INDIA";
		String result = "";
		for (int i = s.length()-1; i >=0; i--) {
			result+= s.charAt(i);
		}
		System.out.println(result);
	}

}
