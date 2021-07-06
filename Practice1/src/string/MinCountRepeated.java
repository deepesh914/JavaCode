
package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MinCountRepeated {
     
		 public void firstWay() {
            String value = "aabbb";
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for(char c: value.toCharArray()) {
                            if(map.containsKey(c)) {
                                map.put(c, map.get(c)+1);
                                List<Character> list = new ArrayList<Character>();
                                list.add(c);
                            }else {
                                map.put(c, 1);
                            }
            }
            int count = 0;
            Set<Map.Entry<Character, Integer>> set = map.entrySet();
            for(Map.Entry<Character, Integer> valueData: set) {
                            if(valueData.getValue()%2 == 0) {
                                            count = count + 1;
                            }
            }
            System.out.println(map.size() == count ?"Even":"Odd");
	 }

            public void secondWay() {
                String value = "aaaabbbb";
                Map<Character, Integer> map = new HashMap<Character, Integer>();
                for(char c: value.toCharArray()) {
                                if(map.containsKey(c)) {
                                                map.put(c, map.get(c)+1);
                                }else {
                                                map.put(c, 1);
                                }
                }
                System.out.println(map);
                int count = 0;
                boolean values = true;
                int[] array = new int[map.size()];
                Set<Map.Entry<Character, Integer>> set = map.entrySet();
                for(Map.Entry<Character, Integer> valueData: set) {
	                if(valueData.getValue()%2 == 0) {
                        array[count] = valueData.getValue();
                        count++;
	                }else{
                        values = false;
                        break;
	                }
                }
                System.out.println(values ? containsSameValues(array):"Odd");
         }
		                
                public String containsSameValues(int[] array) {
                                int first = array[0];
                                for(int i=0;i<array.length;i++) {
                                                if(array[i] != first) {
                             return "odd";
                         }
                      }
                      return "even";
                }
                
                public static void main(String[] args) {
                                
	                Map<String, Integer> map = new HashMap<String, Integer>();
	                List<Integer> list = new ArrayList<Integer>();
	                map.put("a", 101);
	                map.put("b", 102);
	                map.put("c", 103);
	                map.put("d", 104);
	                Set<Map.Entry<String, Integer>> set = map.entrySet();
	                for (Map.Entry<String, Integer> value: set) {
	                                list.add(value.getValue());
	                }
	                System.out.println(list);
	                
	                MinCountRepeated min = new MinCountRepeated();
	                min.secondWay();
	                min.firstWay();
                }               


	}

