package starpattern;

public class M4 {
	public static void main(String[] args) {
		int rows = 5, cols = (rows*2)-1;
		for (int i=1; i<=rows; i++){
			for(int j=1; j<i ; j++){
				System.out.print(" ");
			}
			for(int j=i; j<=cols-(i-1) ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
