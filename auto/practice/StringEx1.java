package auto.practice;

public class StringEx1 {

	public static void main(String[] args) {

		String name="Shalaka";
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		System.out.println(name.indexOf('l'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat("Saavi"));
		System.out.println(name.contains("a"));
		
		String fullName="      Saavi Saradagi     ";
		System.out.println(fullName.trim());
	}

}
