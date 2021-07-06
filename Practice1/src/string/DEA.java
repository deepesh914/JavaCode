package string;

public class DEA {

	public static void main(String[] args) {
		String s1 = "DA3456788";
		String s2 = s1.substring(0, 2);
		String s3 = s1.substring(2, 9);
		boolean alpha = s2.matches("[a-zA-Z]+");
		boolean number = s3.matches("\\d+");
		if (alpha == true && number == true){
			System.out.println("Achieved");
		}else{
			System.out.println("Error");
		}
	}
}
