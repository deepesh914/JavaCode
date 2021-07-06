package DecimalConversions;
// convert decimal to binary
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		int temp = 0;
		String result = "";
		while(i>0){
			temp = i%2;
			result = result + "" + temp;
			i = i/2;
		}
		//To print in reverse order
		char[] ch = result.toCharArray();
		for(int j = ch.length-1; j>=0 ; j--){
			System.out.print(ch[j]);
		}
		
	}
}
