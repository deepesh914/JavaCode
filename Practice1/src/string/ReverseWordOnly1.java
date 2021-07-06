package string;

public class ReverseWordOnly1 {

	public static void main(String[] args) {
		String s = "My am living in India";
		String[] split = s.split(" ");
		String result = "";
		for (int i = 0; i < split.length; i++) {
			String reverse = "";
			String word = split[i];
			for (int j = word.length()-1; j >=0; j--) {
				reverse = reverse + word.charAt(j);
			}
			result = result + reverse + " ";
		}
		System.out.println(result);
	}

}
