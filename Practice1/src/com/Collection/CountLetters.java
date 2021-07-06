package com.Collection;

import java.util.*;

public class CountLetters {

	public static void main(String[] args) {
		//String s = "bbb aa zzz cc yy ddd xx";
		//String s = "aabc deddj fhds fjh";
		String s = "I am a good person";
		s = s.replaceAll(" ", "");
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		
		for(char c: s.toCharArray()){
			if (h.containsKey(c)) {
				h.put(c, h.get(c)+1);
			}
			else{
				h.put(c, 1);
			}
		}
		System.out.println(h);
		
	}
}
