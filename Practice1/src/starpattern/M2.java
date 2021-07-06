package starpattern;

public class M2 {

	public static void main(String[] args) {
		int rows = 9, cols = (rows/2)+1;
		for (int i = 1; i <= rows; i++) {
			if(i<=cols){
				for (int j = 1; j <= i ; j++) {
					System.out.print("*");
				}
			}
			else
			{
				for (int j = i; j <= rows ; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
