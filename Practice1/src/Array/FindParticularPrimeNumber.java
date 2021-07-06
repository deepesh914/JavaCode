package Array;

public class FindParticularPrimeNumber {
	public static void main(String[] args){
		int no = 23;
		boolean flag = false;
		for (int i = 2; i < (no/2); i++) {
			if((no%i)==0){
				System.out.println(no+" is not prime number");
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println(no+" is prime number");
		}
	}
}
