package Assignments;

public class Average88 {

	static double average=0;
	static double average1=0;

	static int sum=0;
	static double sum1=0;
	static double output=0;
	
	public static void main(String[] args) {

		int number[]=new int[4];
		number[0]=10;
		number[1]=20;
		
		number[2]=30;
		number[3]=40;
		
		double num[]=new double[4];
		num[0]=40;
		num[1]=50;
		num[2]=60;
		num[3]=30;
		
		for(int i=0;i<number.length;i++) {
			sum=sum+number[i];
			average=sum/number.length;
		}
		System.out.println(average);
		
		for(int i=0;i<num.length;i++) {
			sum1=sum1+num[i];
			average1=sum1/num.length;
		}
		System.out.println(average1);
		
		output=(average+average1)/(number.length+num.length);
		System.out.println("Average of both array's :" + output);
	}
	

}
