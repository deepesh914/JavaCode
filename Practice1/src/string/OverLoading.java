package string;

public class OverLoading {

	public static void main(String[] args) {
		
		F f = new F();
		float a1 = f.add(3.1f, 4);
		System.out.println(a1);
		E e = new E();
		e.f2();
		e.f1();
	}

}

class D{
	public void f1(){
		System.out.println("D-f1");
	}
	public static void f2(){
		System.out.println("D-f2");
	}
}

class E{
	public void f1(){
		System.out.println("E-f1");
	}
	public static void f2(){
		System.out.println("E-f2");
	}
}

class F{
	int add(int a, int b){
		return a+b;
	}
	float add(float c, int d){
		return c+d;
	}
}
