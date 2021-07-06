package DecimalConversions;

public class B {
	
	int i;
	B(int i){
		this.i=i;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public static void main(String[] args) {
		B b1 = new B(10);
		B b2 = new B(100);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
