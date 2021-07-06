package string;

import java.util.*;

public class PhoneNo {

	public static void main(String[] args) {
		
		String s1 = "(123) 456-7890";
		String s2 = s1.replaceAll("[//.,()//]", "");
		
		System.out.println("S1 value is:"+s1);
//		for(int i = 0)
//		s1 = s1.replace("(", "");
//		s1 = s1.replace(")", "");
//		s1 = s1.replace(" ", "");
//		s1 = s1.replace("-", "");
		System.out.println(s1);
		String s3 = "(" + s1.substring(0, 3) + ")" + " " + s1.substring(3, 6) + "-" + s1.substring(6);
		System.out.println(s2);
		
		
		StringBuilder sb = new StringBuilder("(123) 456-7890");
		sb.deleteCharAt(0);
		sb.deleteCharAt(3);
		sb.deleteCharAt(3);
		sb.deleteCharAt(6);
		System.out.println(sb);


	}

}
