package Assignments;

public class OverloadMainMethod91 {

	public static void main(int args)  {

		System.out.println("main() overloaded"
                + " method 1 Executing"); 
	}
	public static void main(char args) 
    { 
        System.out.println("main() overloaded"
                           + " method 2 Executing"); 
    } 
  
   public static void main(Double[] args) 
    { 
        System.out.println("main() overloaded"
                           + " method 3 Executing"); 
    } 
  
    public static void main(String[] args) 
    { 
        System.out.println("Original main()"
                           + " Executing"); 
    } 

}
/*
 * it is clear that every time original main method executes but not the
 * overloaded methods because JVM only executes the original main method by
 * default but not the overloaded one. So, to execute overloaded methods of
 * main, we must call them from the original main method.
 */