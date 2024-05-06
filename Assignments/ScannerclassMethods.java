package Assignments;

import java.util.Scanner;

public class ScannerclassMethods {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		byte a1=s.nextByte();
		System.out.println(a1);
		
		Short a2=s.nextShort();
		System.out.println(a2);
		
		int a3=s.nextInt();
		System.out.println(a3);
		
		long a4=s.nextLong();
		System.out.println(a4);
		
		String a5=s.next();
		System.out.println(a5);
		
		float a6=s.nextFloat();
		System.out.println(a6);
		
		double a7=s.nextDouble();
		System.out.println(a7);
		
		boolean a8=s.nextBoolean();
		System.out.println(a8);
		
		s.close();
				
	}

}
