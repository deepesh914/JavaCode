package java8lambda;

@FunctionalInterface
interface Addable{
	int add(int a, int b);
}

public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		
		Addable a1 = (a,b) -> (a+b);
		
		System.out.println("Addition of two numbers : "+a1.add(10, 20));
		
		System.out.println("Addition of two numbers : "+a1.add(100, 200));
	}

}
