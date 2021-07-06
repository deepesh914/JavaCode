package Array;

//Find missing only one number.
public class FindMissing {

	public static void main(String[] args) {
		int[] x = { 1, 4, 3, 2, 6 };
		int n = x.length + 1, sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("Sum of the given elements is " + sum);
		int sumNatural = n * (n + 1) / 2;
		int diff = sumNatural - sum;
		System.out.println("Missing Number is " + diff);
	}
}
