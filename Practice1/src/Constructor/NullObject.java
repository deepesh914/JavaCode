package Constructor;

public class NullObject {

	public static void main(String[] args) {
		//B b1 = new B();
		B b2 = new C();
//		B b3 = b2.f1();
//		C c1 = new C();
		//C c2 = (C) new B(); // RTE: NullPointerException
//		b1.f1();
//		b1.f2();
		b2.f1();
		b2.f2();
//		c1.f1();
//		c1.f2();
//		c1.f3();
	}

}

class B{
	
	public void f1(){
		System.out.println("B-F1");
	}
	
	public void f2(){
		System.out.println("B-F2");
	}
}

class C extends B{
	public void f1(){
		System.out.println("C-F1");
	}
	public void f3(){
		System.out.println("C-F3");
	}
}
