package Array;

// To remove duplicate values in array
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
        int[] a = {1,3,4,5,6,3,2,5};
        Set<Integer> set = new HashSet<Integer>();
        for(int value : a) {
            set.add(value);
        }
        System.out.println(set);
    }

}
