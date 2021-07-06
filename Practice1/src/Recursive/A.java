package Recursive;

public class A {

	public static void main(String[] args) {
		System.out.println("Begin");
		Test(1);
		System.out.println("End");
	}

	private static void Test(int i) {
		System.out.println(i);
		if(i==5){
			return;
		}
		Test(++i);		
	}

}
