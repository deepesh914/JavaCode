package DecimalConversions;

public class C {

	int i;
	C(int i){
		this.i=i;
	}
	@Override
	public int hashCode() {
		return i;
	}
	public static void main(String[] args) {
		C c1 = new C(10);
		System.out.println(c1.hashCode());
		C c2 = new C(100);
		System.out.println(c2.hashCode());
		
		
	}

}
