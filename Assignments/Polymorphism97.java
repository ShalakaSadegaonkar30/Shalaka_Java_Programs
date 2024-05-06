package Assignments;

// Use the Concept of Polymorphism and write the program of MethodOverriding and create the object of ParentCalss execute the Program..\

public class Polymorphism97
{

  void Add()
  {
	  System.out.println("Addition");
  }
}
  class Sub extends Polymorphism97
  {  
	  void Add()
		{
			System.out.println("Addition of 2 no's..");
	    }  
  public static void main(String args[])
  {  
	  Polymorphism97 b = new Sub();  
	    b.Add();  	  

  }
}