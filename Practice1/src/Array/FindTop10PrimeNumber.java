package Array;

public class FindTop10PrimeNumber {

	public static void main(String[] args) {
		int count = 1;
		int no = 2;
		boolean isPrime = true;
		System.out.println("Top 10 Prime numbers");
		while(count<=10){
			for (int i = 2; i <= (no/2); i++) {
				if(no%i == 0){
					isPrime = false;
					break;
				}else{
					isPrime = true;
				}
			}
			if(isPrime){
				System.out.print(no + " ");
				count++;
			}
			no++;
		}
	}
}
