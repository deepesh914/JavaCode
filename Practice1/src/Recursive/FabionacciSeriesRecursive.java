package Recursive;

public class FabionacciSeriesRecursive {

	public static void main(String[] args) {
		Test(10);
	}

	private static void Test(int no) {
		int i = 0;
		int j = 1;
		int sum = 0;
		while(no>=1){
			System.out.print(i+" ");
			sum = i+j;
			i = j;
			j = sum;
			no--;
		}
	}
}
