package Assignments;

class ParentClass{
	
}
public class UpcastEx extends ParentClass {

	public static void main(String[] args) {
		
		ParentClass p1=new UpcastEx(); // Implicit upcasting
		ParentClass p2=(ParentClass) new UpcastEx(); //Explicit typecasting
	}
}
