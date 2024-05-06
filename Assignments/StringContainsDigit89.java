package Assignments;

import java.util.Arrays;

public class StringContainsDigit89 {

	static int countDigits=0;
	public static void main(String[] args) {


		String input="Shalak23a";
		int ip=input.length();
		
		char[] c1=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++)
		{
			boolean ans=Character.isDigit(c1[i]);
			if(ans==true) {
				countDigits++;
			}
		}
		System.out.println(countDigits);
		
		if(countDigits==input.length())
		{
			System.out.println("String dont contains digits..");
		}
		else 
		{
			System.out.println("String contains digits..");
		}
			
	}

}
