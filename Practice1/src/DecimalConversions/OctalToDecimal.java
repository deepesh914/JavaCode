package DecimalConversions;
//octal to decimal
import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		double result =0;
		int power = 0, k=0;
		while(i>0){
			k = i%10;
			result= result + k * Math.pow(8, power);
			power++;
			i = i/10;
		}
		System.out.print(result);
	}

}
