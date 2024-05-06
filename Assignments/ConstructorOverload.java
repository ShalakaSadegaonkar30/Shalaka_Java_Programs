package Assignments;

public class ConstructorOverload {

	int id;  
    String name;  
    int age; 
    int standard;
    String subject;
    int marks;
   float percentage;

    
    public ConstructorOverload(int id,String name,int age,int standard,String subject,int marks,float percentage) {
    	System.out.println("saavi");
    }
	public static void main(String[] args) {
	
		ConstructorOverload o=new ConstructorOverload(1,"saavi", 18, 11, "Maths", 91, 94);
	}

}
