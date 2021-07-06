package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNumberWithCollections1 {

	public static void main(String[] args) {
		int[] x = {1,2,4,5,8,7,3,4,5,6,8};
		
		Map<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (int i = 0; i < x.length; i++) {
			if(h.containsKey(x[i])){
				h.put(x[i], h.get(x[i])+1);
			}else{
				h.put(x[i], 1);
			}
		}
		System.out.println(h);
		
		Set<Map.Entry<Integer, Integer>> set = h.entrySet();
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return -(o1.getValue() - o2.getValue());
			}			
		});
		
		Iterator<Map.Entry<Integer, Integer>> itr = list.iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, Integer> m = itr.next();
			if(m.getValue()>1){
				System.out.println("Duplicate Numbers are: "+m.getKey());
			}
		}
	}

}
