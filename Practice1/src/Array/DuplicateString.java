package Array;
//Remove duplicate String using collection
import java.util.*;

public class DuplicateString {

	public static void main(String[] args) {
		String[] s = {"abc", "def", "ghi", "xyz", "abc", "def"};
		HashSet<String> set = new HashSet<>();
		for(String value : s){
			set.add(value);
		}
		System.out.println(set);
	}

}
