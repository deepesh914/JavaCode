package string;

public class Email {

	public static void main(String[] args) {
		
		String input="Bants1939@ar154.";
		int s2 = input.indexOf("@");
		int s3 = input.lastIndexOf(".");
		
		String s4 = input.substring(s2+1, s3);
		String s5 = s4.replaceAll("[*0-9]", "%");
		System.out.println(s5);
		if (s5.contains("!") || s5.contains("#") || s5.contains("$") || s5.contains("%") || s5.contains("^") || 
			s5.contains("&") || s5.contains("*") || s5.contains("(") || s5.contains(")") || s5.contains("_") ||
			s5.contains("-") || s5.contains(" ") || s5.contains(".")){
				System.out.println("Error");
			}else{
				System.out.println("No Error");
			}
	}
}
 