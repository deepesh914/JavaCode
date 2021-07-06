package Constructor;

import java.io.IOException;

public class E {

	E() throws IOException, IllegalAccessException{
		System.out.println("E-constructor");
		throw new IllegalAccessException("");
		//System.out.println("E-Constructor");
	}
	public static void main(String[] args) throws Exception {
	
		F f = new F();
		f.m1();

	}

}

class F extends E{
	
	F() throws Exception{
		System.out.println("F-Constructor");
	}
	
	void m1(){
		System.out.println("F-m1");
	}
}
class G extends F{

	G() throws Exception {
		super();
	}
	
}