package Assignments;

import java.util.Arrays;

public class CountSpecialCharacters {

	static int countSpace;
	static int countAlphabetes;
	static int countNumeric;
	static int countSpecialCharacters=0;
	
	
	public static void main(String[] args) {

		String name="Shalaka1@3#";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++) {
			int ans=(Character.isAlphabetic(c1[i]) + Character.isDigit(c1[i]) + Character.isSpaceChar(c1[i])-countSpecialCharacters);
			System.out.println(ans);
		}
	}

}
