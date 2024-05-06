package Assignments;

public class GlobalVariable {

	int a=10;
	int b=5;
	
	 void add() {
		
		System.out.println(a+b);
	}
	 void sub() {
			
			System.out.println(a-b);
		}
	 void mul() {
			
			System.out.println(a*b);
		}
	 void div() {
			
			System.out.println(a/b);
		}
	 void mod() {
			
			System.out.println(a%b);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GlobalVariable g=new GlobalVariable();
		g.add();
		g.sub();
		g.mul();
		g.div();
		g.mod();
		
		
		
	}

}
