package Assignments;

public class TryCatchFinally99 
{
	public static void main(String[] args) {

	try{    
		int a=25/5;    
		System.out.println(a);    
		}    
		 
	catch(NullPointerException e)
	{  
		System.out.println(e);  
	}    
		
	finally
	{  
		System.out.println("finally block will always execute..");  
	}    
		    
}
	
}