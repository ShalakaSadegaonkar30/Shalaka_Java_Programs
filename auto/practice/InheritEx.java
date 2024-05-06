package auto.practice;
class Grand_parent
{
	static void add()
	{
		System.out.println("Addition..");
	
	}
}
class Parent_Class extends Grand_parent
{
	static void sub()
	{
		System.out.println("subtraction..");
	}
}
public class InheritEx extends Parent_Class
{
	static void mul()
	{
		System.out.println("Multiplication..");

	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
	}

}
