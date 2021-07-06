package DecimalConversions;
//Convert decimal to octal
import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		String s = "";
		int temp = 0;
		while(i>0){
			
			temp = i%8;
			s = s + "" + temp;
			i = i/8;
		}
		// To print in reverse order
		char[] c = s.toCharArray();
		for (int j = c.length-1; j>=0; j--) {
			System.out.print(c[j]);
		}

	}

}
