package Recursive;

public class SumOfNumbers {

	public static void main(String[] args) {
		int sum = Test(1235);
		System.out.println("sum of numbers "+ sum);
	}

	private static int Test(int i) {
		if(i==0){
			return i%10;
		}
		return i%10 + Test(i/10);
	}

}
