package Assignments;

public class SIB_IIB_MM_ExecutionEx{
	
	static {
		System.out.println("I'm SIB....");
	}
	
	{
        System.out.println("I'm IIB...");
    }
	public SIB_IIB_MM_ExecutionEx(){
        System.out.println("Constructor");

	}

	public static void main(String[] args) {

		SIB_IIB_MM_ExecutionEx ex=new SIB_IIB_MM_ExecutionEx();
		System.out.println("I'm main method...");
	}

}
