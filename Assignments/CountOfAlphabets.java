package Assignments;

import java.util.Arrays;

public class CountOfAlphabets {

	static int countOfalpha;
	
	public static void main(String[] args) {

		String name="Shalaka";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++) {
			boolean ans=Character.isAlphabetic(c1[i]);
			if(ans==true) {
				countOfalpha++;
			}
		}
		System.out.println(countOfalpha);
	}

}
