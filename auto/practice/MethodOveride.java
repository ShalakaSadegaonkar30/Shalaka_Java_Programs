package auto.practice;
class ParentClass{
	
	void interestRate(int a) {
		System.out.println("SBI interest rate is: " +a );
	}
}
public class MethodOveride extends Parent_Class {
	
	void interestRate(int a) {
		System.out.println("SBI interest rate is: " +a );
	} 

	public static void main(String[] args) {
	MethodOveride mo=new MethodOveride();
	mo.interestRate(5);

	}

}
