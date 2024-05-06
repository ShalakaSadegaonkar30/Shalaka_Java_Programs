package Assignments;

import java.util.Arrays;

public class AnagramEx {

	public static void main(String[] args) {

		String input1="bread";
		String input2="beard";
		
		char[] c1=input1.toCharArray();
		char[] c2=input2.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)==true) {
			System.out.println("Is Anagram...");
		}else {
			System.out.println("Not Anagram..");
		}

	
	}

}
