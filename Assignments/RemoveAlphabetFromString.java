package Assignments;

public class RemoveAlphabetFromString {

	public static void main(String[] args) {


		String input="School";
		String output=input.replace('o',' ');
		System.out.println(output);
		
		String output1=input.replace('o','m');
		System.out.println(output1);
		
		String input1="Sc89hool78";
		String output2=input1.replaceAll("[0-9]"," ");
		System.out.println(output2);
	}

}
