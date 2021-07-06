package Interface;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		double x ;
		double b = 1;
		Scanner s=new Scanner(System.in);
        System.out.print("Enter any number:");
        x = s.nextDouble();
		int length = 0;
		while(b<=x){
			length++;
			b = b*10;
		}
		System.out.println(length);
		System.out.println(b);
		s.close();
	}
}
