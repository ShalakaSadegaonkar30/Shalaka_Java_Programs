package Assignments;

import java.util.Date;

public class DateClassEx {

	public static void main(String[] args) {

		Date dt=new Date();
		System.out.println(dt);
		String input=dt.toString();
		System.out.println(input);
		String month=input.substring(4, 7);
		System.out.println(month);
		String date=input.substring(8, 10);
		System.out.println(date);
		String year=input.substring(24);
		System.out.println(year);
		
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));

	}

}
