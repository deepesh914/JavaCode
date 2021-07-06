package Array;

import java.util.*;
import java.util.ArrayList;
import java.util.Map.Entry;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] x = {1,2,4,5,8,7,3,4,5,6};
	
		/* To remove duplicates*/
		/*HashSet<Integer> m = new HashSet<Integer>();
		for (int y : x) {
			m.add(y);
		}
		 System.out.println(m);*/
		
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < x.length; i++) {
			if(h.containsKey(x[i])) {
				h.put(x[i], h.get(x[i])+1);
			}
			else {
				h.put(x[i], 1);
			}
		}
		Set<Map.Entry<Integer, Integer>> set = h.entrySet();
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
		
		//To do
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){

			@Override
			public int compare(Map.Entry<Integer, Integer> arg0, Map.Entry<Integer, Integer> arg1) {
				return -(arg0.getValue()-arg1.getValue());
			}
		});
		
		Iterator<Map.Entry<Integer, Integer>> itr = list.iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, Integer> value = itr.next();
			if(value.getValue()>1)
			System.out.println("Maximun value is " + value.getKey());
			//break;
		}
	}

}
