package starpattern;

public class M1 {

	public static void main(String[] args) {	
		for(int i = 1; i<=4; i++){
			
			for(int j = i-1; j<(2*i)-2; j++){
				System.out.print(" ");
			}
		
			for(int j = i; j<=8-i; j++){
			System.out.print("*");
			}
			
			System.out.println();		
		}
	}

}
