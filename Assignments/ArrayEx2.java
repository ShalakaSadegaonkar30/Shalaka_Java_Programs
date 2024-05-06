package Assignments;
import java.util.Arrays;
public class ArrayEx2 
{
	public static void main(String[] args) 
	{
		int nos[]=new int[4];
		nos[0]=41;
		nos[1]=87;
		nos[2]=41;
		nos[3]=12;
		int givenno=41;
		
		for(int i=0;i<nos.length;i++)
		{
				if(givenno==nos[i])
				{
					System.out.println("Number is present in the given Array at the index position "+i);
				}
				else
				{
					System.out.println("Number is not present in the given Array at the index position "+i);
				}
		}
		
		
		
	}

}
