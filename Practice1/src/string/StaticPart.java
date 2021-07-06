package string;

interface A2{
	static int x = 10;
}

class A3 implements A2{
	
	static int x = 20;
}

public class StaticPart implements A2{

	public static void main(String[] args) {
		
		System.out.println(A3.x);
		A3.x = 50;
		System.out.println(A3.x);
		A3 a3 = new A3();
		a3.x = a3.x + 30;
		System.out.println(a3.x);
		StaticPart sp = new StaticPart();
		System.out.println(sp.x);
		//sp.x = sp.x + 100; //CTE
		//System.out.println(sp.x);
	}

}
