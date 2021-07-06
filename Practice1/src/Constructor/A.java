package Constructor;

public class A {
	public static void main(String[] args) throws Exception {
		int i = 0;
		boolean b = false;
		Integer a = null;
		Character c = null;
		char c1 = 0;
		System.out.println(c1);
//		Child c = new Child();
//		c.m1();
//		Parent p = new Parent();
//		p.m1();
//		Parent p1 = new Child();
		Parent p1 = new Child();
		Parent p2 = null;
		try{
			p2.m1();
		}
		catch(NullPointerException np){
			System.out.println("");
		}

//		System.out.println(p1);
//		System.out.println(fun());

	}

//	static int fun(){
//		return 10;
//	}
}

class Parent{
	
	Parent() throws ArithmeticException{
		System.out.println("Parent-Constructor");		
	}
	void m1() {
		try{
		System.out.println("Parent-m1");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class Child extends Parent{
	Child() throws Exception{
		System.out.println("Child-Constructor");
	}
	void m1(){
		try{
		System.out.println("Child-m1");
		}
		catch(NullPointerException n){
			System.out.println(n);
		}
	}
}