package Array;

public class FibonacciSeries {

	public static void main(String[] args) {
		int value = 10;
		int i=0, j=1, sum=0;
		while(value!=0){
			System.out.print(i +" ");
			sum = i+j;
			i = j;
			j = sum;
			value--;
		}

	}

}
