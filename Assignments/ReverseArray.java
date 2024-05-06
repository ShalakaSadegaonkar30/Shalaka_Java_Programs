package Assignments;

import java.util.Arrays;

public class ReverseArray {

	
	public static void main(String[] args) {

		String input="";
		String reverse="";
		
		String name[]=new String[4];
		name[0]="Ram";
		name[1]="Sham";
		name[2]="Sita";
		name[3]="Gita";
		
		String namecopy[]=new String[name.length];
		for(int i=0;i<name.length;i++)
		{
			namecopy[i]=name[i];
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(namecopy));

		for(int i=namecopy.length-1;i>=0;i--)
		{
			
            System.out.print(namecopy[i] + " ");  

		}
	}

}
