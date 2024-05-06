package Assignments;

public class StaticNonstaticEx {

	int a=10; 
	int b=2;
	
	void add()
	{
	
		System.out.println(a+b);
	}
	
	static void sub()
	{
		//System.out.println(a-b);

	}
	 
	public static void main(String[] args) {

		StaticNonstaticEx s1=new StaticNonstaticEx();
		s1.add();
		sub();
		
	}

}

