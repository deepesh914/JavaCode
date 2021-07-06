package DecimalConversions;

import java.util.Scanner;

public class DToBPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		int j=0;
		String result = "";
		while(i>0){
			j=i%2;
			result+= "" + j;
			i=i/2;
		}
		//To reverse
		char[] c = result.toCharArray();
		for (int k = c.length-1 ; k >=0 ; k--) {
			System.out.print(c[k]);
		}
	}
}
