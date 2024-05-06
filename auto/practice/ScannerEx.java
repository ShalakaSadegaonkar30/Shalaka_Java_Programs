package auto.practice;

import java.util.Scanner;

public class ScannerEx {

	static void add() {
		int Sum, A, B; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A:");
		A=sc.nextInt();
		System.out.println("Enter value of B:");
		B=sc.nextInt();
		Sum=A+B;
		System.out.println("Addition of A and B is:" + Sum);
		//sc.close();
		
	}

	
	  static void sub() {
	  
		  int Sub, A, B; 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of A:");
			A=sc.nextInt();
			System.out.println("Enter value of B:");
			B=sc.nextInt();
			Sub=A-B;
			System.out.println("Subtraction of A and B is:" + Sub);
			//sc.close();
			
	  } static void mul() {
	  
		  int Mul, A, B; 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of A:");
			A=sc.nextInt();
			System.out.println("Enter value of B:");
			B=sc.nextInt();
			Mul=A*B;
			System.out.println("Multiplication of A and B is:" + Mul);
			//sc.close();
			
	  } static void div() {
		  
		  int Div, A, B; 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of A:");
			A=sc.nextInt();
			System.out.println("Enter value of B:");
			B=sc.nextInt();
			Div=A/B;
			System.out.println("Division of A and B is:" + Div);
			//sc.close();
	  
	  } static void mod() {
	  
		  int Mod, A, B; 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of A:");
			A=sc.nextInt();
			System.out.println("Enter value of B:");
			B=sc.nextInt();
			Mod=A%B;
			System.out.println("Modules of A and B is:" + Mod);
			sc.close();
	  }
	 
	public static void main(String[] args) {

		add();
		sub();
		mul();
		div();
		mod();
		
	}

}
