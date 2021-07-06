package string;

public class TwoString {

	public static void main(String[] args) {
		String s1 = "ABC,1,20000|DEF,2,30000";
		String s2 = "1,Sales|2,Manager";
		
		String[] split1 = s1.split("\\|");
		String[] split2 = s2.split("\\|");
		
		for (int i=0; i < split1.length; i++) {
			String s3 = split1[i];
			String s4 = split2[i];
			
			String[] subSplit1 = s3.split("\\,");
			String[] subSplit2 = s4.split("\\,");
			
			for (int j = 0; j < subSplit1.length; j++) {
				String s5 = subSplit1[j];
				//System.out.println(s5);		
				if(j==1){
					for (int k = 0; k < subSplit2.length; k++) {
						if(k==1){
							String s6 = subSplit2[k];
							//System.out.println(s6);
							subSplit1[j] = s6;
						}
					}
				}				
			}
			for (int j = 0; j < subSplit1.length; j++){
				System.out.print(subSplit1[j]+",");
			}
		}
	}
}