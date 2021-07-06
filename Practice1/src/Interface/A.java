package Interface;

public class A {

	public static void main(String[] args) {
		int a = 10111011;
		int[] b = new int[a];
		int count = 0;
		
		for(int i=0; i<b.length; i++){
            for(int j=i; j<i+1; j++){
                if(b[i] == b[j]){
                    count++;
                }
            }
        }
		System.out.println(b);
	}

}
