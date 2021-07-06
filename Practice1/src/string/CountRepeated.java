package string;

import java.util.*;

public class CountRepeated {

	public static void main(String[] args) {
		
		String s1 = "abcdabcddddd";
		s1 = s1.toLowerCase();
		char[] ch = s1.toCharArray();
		int count = 0, acount = 0, bcount = 0;
		Map<Character, Integer> m = new LinkedHashMap<Character,Integer>();
		for(int i=0; i<ch.length; i++){
			
			for(int j=i+1; j<ch.length; j++){
				
				if(ch[i]==ch[j] && ch[i]==ch[0]){
					m.put(ch[i], acount++);
					acount++;
				}
				else if(ch[i]==ch[j]){
					m.put(ch[i], bcount++);
					bcount++;
				}
				count = bcount;
			}
			bcount = 0;
		}
		System.out.println(acount);
		System.out.println(bcount);
		System.out.println(count);
		if((ch.length%2 == 0) && acount == count){
			System.out.println("Even");
		}
		else{
			System.out.println("odd");
		}
	}

}
