package string;

public class TypeCasting {

	public static void main(String[] args) {
		
		Object o = new String("Deep");
		//StringBuffer sb = (StringBuffer) o;
		String s1 = (String) o;
		System.out.println(s1);
		
		String s2 = new String("Me");
		Object o1 = (Object) s2;
		System.out.println(o1);
	}

}
