package Exception;

public class C {

	public static void main(String[] args) {
		
		/*Cat[] c = {new Cat(), new Cat()};
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			c[i].m1();
		}*/
		
		Dog[] d = {new Cat(), new Cat()};
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
			d[i].m1();
		}
	}

}

class Dog{
	public static void m1(){
		System.out.println("Dog-m1");
	}
	public void m2(){
		System.out.println("Dog-m2");
	}
}
class Cat extends Dog{
	public static void m1(){
		System.out.println("Cat-m1");
	}
	public void m2(){
		System.out.println("Cat-m2");
	}
}