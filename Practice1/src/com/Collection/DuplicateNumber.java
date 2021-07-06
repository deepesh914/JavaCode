package com.Collection;
//Remove duplicate numbers
import java.util.*;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] i = {2,5,8,6,4,2,8,6,1,7,1};
		//LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		TreeSet<Integer> l = new TreeSet<Integer>();
		
		for(int j: i){
			l.add(j);
		}
		System.out.println(l);
		
//		List<Integer> l1 = new LinkedList<Integer>(l);
//		Collections.sort(l1);
//		System.out.println(l1);
	}

}

