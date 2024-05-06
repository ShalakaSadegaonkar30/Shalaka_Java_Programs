package auto.practice;

public class IIBEx 
{
	static  //SIB
	{
		System.out.println("SIB");
	}
	static  //SIB
	{
		System.out.println("SIB 1");
	}
	{  //IIB
		System.out.println("IIB 1");
	}
	{  //IIB
		System.out.println("IIB 2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		IIBEx i1=new IIBEx();
		IIBEx i2=new IIBEx();
	}

}
