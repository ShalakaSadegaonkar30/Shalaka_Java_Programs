package Assignments;

public class Array1 {

	public static void main(String[] args) {
		
		
		
		String names[]=new String[3];
		names[0]="shalaka";
		names[1]="shivani";
		names[2]="saaaavi";
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("---------------");
		
		int rollno[]=new int[3];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;

		System.out.println("Student names"+ "  " +  "Roll no");

		for(int i=0;i<3;i++)
		{		
			System.out.println(names[i] + " " +        rollno[i]);
		
		}
		System.out.println("---------------");

		char gender[]=new char[3];
		gender[0]='F';
		gender [1]='M';
		gender[2]='F';

		System.out.println("Student names"+ "  " +  "Roll no" + "   "+ "Gender");

		for(int i=0;i<3;i++)
		{		
			System.out.println(names[i] + "         " +  rollno[i] +"           " + gender[i]);
			
		}
	}

}
