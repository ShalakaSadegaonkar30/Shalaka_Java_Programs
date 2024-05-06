package auto.practice;


public class ThisStatementEx
{
	ThisStatementEx(){
		this(10);
		System.out.println("first");
	}
	ThisStatementEx(int a){
		this(4,5);
		System.out.println("second");

	}
	ThisStatementEx(int a,int b){
		System.out.println("third");

	}

	public static void main(String[] args) {

		ThisStatementEx ex=new ThisStatementEx();
		
	}

}
