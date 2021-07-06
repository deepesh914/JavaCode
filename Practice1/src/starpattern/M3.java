package starpattern;

public class M3 {
	public static void main(String[] args) {
		int rows = 7, cols = (rows/2)+1;
		for (int i=1; i<=rows; i++){
			if (i<=cols){
				for(int j=i; j<cols; j++){
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++){
					System.out.print("*");
				}
			}
			else{
				for(int j=cols; j<i; j++){
					System.out.print(" ");
				}
				for(int j=i; j<=rows; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
