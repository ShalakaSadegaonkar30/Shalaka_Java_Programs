package auto.practice;

public class ThisKeyword {

	int age;
	String name;
	double salary;
	
	void details(int age, String name,double salary) {
		
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {

		ThisKeyword th=new ThisKeyword();
		th.details(4, "shalaka", 4000);
		System.out.println(th.age);
		System.out.println(th.name);
		System.out.println(th.salary);
	}

}
