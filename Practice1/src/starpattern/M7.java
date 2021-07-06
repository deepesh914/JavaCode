package starpattern;

public class M7 {

	public static void main(String[] args) {
		int start = 5;
		int rows = 8;
		for (int i = 1; i <= rows; i++) {
			if(i<=rows/2){
				for (int j = 1; j <=i ; j++) {
					System.out.print(start);
					if(j==i){
						break;
					}
				}
				start++;
			}
			else{
				for (int j = i; j <=rows ; j++) {
					System.out.print(start-1);
				}
				start--;
			}
			System.out.println();
		}

	}

}
