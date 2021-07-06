package DecimalConversions;

import java.util.Scanner;

public class BToDPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value");
		int i = sc.nextInt();
		int power = 0, j=0;
		double result=0;
		while(i>0){
			j=i%10;
			result+= j*Math.pow(2, power);
			power++;
			i=i/10;
		}
		System.out.println(result);
	}

}
