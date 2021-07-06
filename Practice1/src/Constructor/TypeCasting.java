package Constructor;

public class TypeCasting {

	public static void main(String[] args) {
		
		String s = new String("Name");
		Object o = (Object)s;
		System.out.println(o);//Name
		
		StringBuffer s3 = new StringBuffer("SBName");
		Object o4 = (Object)s3;
		System.out.println(o4);
		
		Object o1 = new String("Deep");
		StringBuffer sb = (StringBuffer)o1;
		System.out.println(sb);//RTE (Downcasting)
		
		String s1 = new String("Hi");
		//StringBuffer sb1 = (StringBuffer)s1;
		//System.out.println(sb1);
		
		Object o2 = new String("Deep");
		//StringBuffer sb2 = (String)o1;
		//System.out.println(sb2);
		
		Object o3 = new String("Deepesh");
		String s2 = (String)o3;
		System.out.println(s2);//RTE (Downcasting)
	}

}
