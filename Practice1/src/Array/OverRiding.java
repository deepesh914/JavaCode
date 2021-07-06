package Array;

public class OverRiding {

	public static void main(String[] args) {
		F f1 = new F();
		E e1 = new F();
		E e2 = new E();
		e1.m1();
		f1.m1();
		e2.m1();
	}

}

class E{
	public void m1() {
		System.out.println("E-M1");
	}
}

class F extends E{
	public void m1() {
		System.out.println("F-M1");
	}
}