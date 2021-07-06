package Array;
import java.util.*;

public class DuplicateInArrayForLoopWithout {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[]{1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5};
        List<Integer> list = Arrays.asList(arr);
	    Set<Integer> h = new HashSet<Integer>(list);
	    System.out.println(h);
	    
	    //OR
	    //System.out.println(new HashSet(Arrays.asList(new Integer[] {1, 10, 1,7,8,9,7, 2, 2, 3, 3, 10, 3, 4, 5, 5})));
	}
}
