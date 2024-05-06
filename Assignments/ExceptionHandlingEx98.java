package Assignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingEx98 {

	public static void main(String[] args)
	{

		Scanner s1= new Scanner(System.in);
		try {
			int n1= s1.nextInt();
			String name[]= new String[n1];
			name[0]="Ram";
			name[1]="Sita";
			name[2]="Laxman";
			name[3]="Hanuman";
			
			System.out.println("vales present in 0-3 index:" +Arrays.toString(name));
			
		}
		catch(InputMismatchException e1){
			System.out.println(e1);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}finally {
			s1.close();
		}
		
		
		
		
	}		
}

