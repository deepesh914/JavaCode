package Array;

import java.util.Arrays;

public class DuplicateInArrayWithoutCollection1 {

	public static void main(String[] args) {
		int[] a = {1,3,4,5,6,3,2,5,6,7,8};
		int[] result = new int[a.length];
		
		Arrays.sort(a);
		result[0] = a[0];
		
		for(int i=1; i<a.length; i++){
			if(a[i]!=a[i-1]){
				result[i] = a[i];
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			if(result[i]==0)
				continue;
			System.out.print(result[i]+",");
		}
	}

}
