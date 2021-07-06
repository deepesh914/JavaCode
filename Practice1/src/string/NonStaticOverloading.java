package string;

public class NonStaticOverloading {

	public static void main(String[] args) {
		A1 a = new A1();
		a.print();
		System.out.println("----------");
		B1 b = new B1();
		b.print();
		System.out.println("----------");
		A1 a1 = new B1();
		a1.print();
		System.out.println("----------");
		/*B1 b1 = new A1();
		b1.print();*/
	}

}

class A1{
	A1(){
		System.out.println("A-Const");
	}
	public void print(){
		System.out.println("A-Print");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("B-Const");
	}
	public void print(){
		System.out.println("B-Print");
	}
}