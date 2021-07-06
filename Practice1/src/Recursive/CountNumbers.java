package Recursive;

public class CountNumbers {

	public static void main(String[] args) {
		int count = Test(15487345);
		System.out.println("count of digits "+count);
	}
	
	private static int Test(int i){
		if(i==0){
			return 0;
		}
		return 1+Test(i/10);
	}
}
