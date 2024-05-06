package Assignments;

public class UpcastingDowncasting101102103 {

	public static void main(String[] args) {

		// Byte age =82 convert this  into  long datatype  and  now update  the value of long datatype 1000
		
		byte age=82;
		long agevalue;
		
		agevalue= (long)age;
		System.out.println(agevalue);
	
		System.out.println("--- explicit type conversion from long to byte ---");
		
		 long firstLong = 150; 
	     long secondLong = -130; 
	        
	        byte firstByte = (byte)firstLong; 
	        byte secondByte = (byte)secondLong; 
	        
	        System.out.println(firstByte); 
	        System.out.println(secondByte); 
	        
			System.out.println("--- convert int datatype into float datatype  ---");

			int num=15;
			
			float num1 = (float)num;
			System.out.println(num1);
	}

}
