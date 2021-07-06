package Array;

import java.util.Arrays;

public class MergeAndSortArrayWithMethod {
		
	public static void main(String[] args) {
		int[] a1 = new int[]{2,4,6,7,0};
		int[] a2 = new int[]{1,3,5,8,9};
		int[] a3 = new int[a1.length+a2.length];
		
		int count = 0;
		for(int i=0; i<a1.length; i++){
			a3[count++] = a1[i];
		}
		for(int j=0; j<a2.length; j++){
			a3[count++] = a2[j];
		}
		for(int i=0; i<a3.length; i++){
			System.out.print(a3[i]+ " ");
		}
		System.out.println();
		
		Arrays.sort(a3);
		
		for(int i=0; i<a3.length; i++){
			System.out.print(a3[i]+ " ");
		}
		
	}

}
