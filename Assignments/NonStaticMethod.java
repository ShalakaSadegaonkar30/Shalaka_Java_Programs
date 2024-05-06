package Assignments;

public class NonStaticMethod {

	int a=10; 
	int b=2;
	void add()
	{
	
		System.out.println(a+b);
	}
	
	 void sub()
	{
		System.out.println(a-b);

	}
	 void mul()
	{
		System.out.println(a*b);

	}
	 void div()
	{
		System.out.println(a/b);

	}
	 void mod()
	{
		System.out.println(a%b);

	}
	
	public static void main(String[] args) {
     
	NonStaticMethod a=new NonStaticMethod();
	a.add();
	NonStaticMethod b=new NonStaticMethod();
	b.sub();
	NonStaticMethod c=new NonStaticMethod();
	c.mul();
	NonStaticMethod d=new NonStaticMethod();
	d.div();
	NonStaticMethod e=new NonStaticMethod();
	e.mod();
	}



}
