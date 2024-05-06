package Assignments;

import java.util.Arrays;

public class CountSpace {
	
	 static int countSpace;
	public static void main(String[] args) {

		String name="Shala ka 1 2 3";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++) {
			boolean ans=Character.isSpaceChar(c1[i]);
			if(ans==true) {
				countSpace++;
			}
		}
		System.out.println(countSpace);	
	}

}
