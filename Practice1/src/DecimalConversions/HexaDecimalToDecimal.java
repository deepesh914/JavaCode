package DecimalConversions;
//hexadecimal to decimal
import java.util.Scanner;

public class HexaDecimalToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String s = sc.next();
		//String s = "1A4D";
		s = s.toUpperCase();
		int power = 0;
		double result = 0;		
		char[] c = s.toCharArray();
		for (int i = c.length-1; i >=0  ; i--) {
			boolean a = true;
			switch(c[i]){
				case 'A': c[i] = 10; a = false; break;
				case 'B': c[i] = 11; a = false; break;
				case 'C': c[i] = 12; a = false; break;
				case 'D': c[i] = 13; a = false; break;
				case 'E': c[i] = 14; a = false; break;
				case 'F': c[i] = 15; a = false; break;
				default : 
			}
			if(a==true){
				result = result + (c[i]-48) * Math.pow(16, power++);
		   }else {
			   result = result + (c[i]) * Math.pow(16, power++);
		   }
		}
		System.out.println(result);
	}
}
