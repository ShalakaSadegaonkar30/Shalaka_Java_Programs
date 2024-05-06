package auto.practice;

class ParentClass1
{
	 ParentClass1()
	{
		System.out.println("Grand parent class");
	}
}
class ChildClass extends ParentClass1
{
	ChildClass()
	{
		System.out.println("Parent class");
	}
}
public class SuperCallingStmntEx extends ChildClass {

	SuperCallingStmntEx()
	{
		super();
		System.out.println("Child class");

	}
	public static void main(String[] args) {

		new SuperCallingStmntEx();
	}

}
