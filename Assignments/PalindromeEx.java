package Assignments;

import java.util.Scanner;

public class PalindromeEx {

	public static void main(String[] args) {

		String input="";
		String reverse="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:  ");

		 input=sc.nextLine();
		{
			for(int i=input.length()-1;i>=0;i--)
			{
				char op=input.charAt(i);
				reverse=reverse+op;
			}
			System.out.println(reverse);
			if(input.equals(reverse))
			{
				System.out.println("Is Palindrome...");
			}
			else {
				System.out.println("Not a Palindrome..");
			}
		}
	}


}
