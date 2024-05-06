package Assignments;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		double area, radius;  
		for(int i=0;i<=10;i++)
		{
		Scanner sc=new Scanner (System.in);  
		System.out.print("Enter the radius of the circle: ");  
		radius=sc.nextDouble();  

		area= Math.PI*radius*radius;  
		System.out.println("The area of the circle is: "+area);
		}
	}

}
