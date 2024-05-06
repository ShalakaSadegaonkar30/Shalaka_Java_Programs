package Assignments;

import java.util.Scanner;

public class ArrayInBooleanInputfromScannerClass {

	public static void main(String[] args)
	{


		Scanner s1=new Scanner(System.in);
		boolean rollno[]=new boolean[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the array: " +i);
			rollno[i]=s1.nextBoolean();
			System.out.println(rollno[i]);
		}

	}
}

