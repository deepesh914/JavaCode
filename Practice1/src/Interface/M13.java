package Interface;

interface B11{
	 
	int a=10;
	void m1();
	void m2();
	void m3();
}

abstract class M333 implements B11{
	
	//int a=20;
	
	public void m1(){
		System.out.println("M23 B class");
	}
	public abstract void m2();
	public abstract void m3();
}


public class M13 extends M333{

	int a = 30;
	public static void main(String[] args) {
		M13 m = new M13();
		m.m1();
		m.m2();
		m.m3();
		System.out.println(m.a);
	}
	
	/*@Override
	public void m1(){
		System.out.println("M13 class");
	}*/
	
	@Override
	public void m2() {
		System.out.println("M13 class");		
	}

	@Override
	public void m3() {
		System.out.println("M13 class");		
	}
}
