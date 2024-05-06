package Assignments;

import java.util.Arrays;

public class CountOfNumeric {

	static int countOfNumeric;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Shalaka123";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++) {
			boolean ans=Character.isDigit(c1[i]);
			if(ans==true) {
				countOfNumeric++;
			}
		}
		System.out.println(countOfNumeric);

	}

}
