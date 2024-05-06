package Assignments;

import java.util.Scanner;

public class AreaCircumferenceOfCircleUsingFinalKeyword {

	public static void main(String[] args) {

		/*double area, radius;  
		Scanner sc=new Scanner (System.in);  
		System.out.print("Enter the radius of the circle: ");  
		radius=sc.nextDouble();  
		area= Math.PI*radius*radius;  
		System.out.println("The area of the circle is: "+area);
		sc.close();
		*/
		
		 final double PI = 3.14;
		 int radius = 4;
		 System.out.println("Area of circle: " + (PI * radius * radius));
		 
		 System.out.println("Circumference of circle: " + (2* PI * radius));

		 
	}

}
