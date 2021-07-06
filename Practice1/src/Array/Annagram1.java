package Array;

import java.util.Arrays;

public class Annagram1 {

	public static void main(String[] args) {
		CheckAnnagram("Keep","Peek");
		CheckAnnagram("Mother in Law", "Hitler Woman");
	}

	private static void CheckAnnagram(String s1, String s2) {
		s1= s1.replace(" ", "");
		s2= s2.replace(" ", "");
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean status = Arrays.equals(c1, c2);
		
		if(status){
			System.out.println("Anagram");
		}else{
			System.out.println("Not Anagram");
		}
	}

}
