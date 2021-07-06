package starpattern;

public class M5 {
	public static void main(String[] args) {
		int rows = 5;
		for (int i=1; i<=rows; i++){
			for(int j=i; j<rows; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i)-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
