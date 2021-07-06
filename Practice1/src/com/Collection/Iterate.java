package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterate {

	public static void main(String[] args) {
		
		List<Character> l = new LinkedList<Character>();
		l.add('A');
		l.add('B');
		l.add('C');
		//System.out.println(l);
		
		Iterator<Character> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		l.add('D');
		System.out.println(l);
	}

}
