package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test1 {

	public static void main(String[] args) throws Exception{
		Account a1 = new Account();
		System.out.println(a1.userName+"--------"+a1.password);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		System.out.println("------------------------------");
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.userName+"--------"+a2.password);
	}

}

class Account implements Serializable{
	
	String userName = "MyName";
	transient String password = "MyPassword";

	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject();
		String epwd = 123+password;
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		password = epwd.substring(3);
	}
}



