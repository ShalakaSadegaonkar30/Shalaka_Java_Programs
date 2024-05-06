package Assignments;

public class SpecialChars72 {

	public static boolean hasSpecialChar(String s)
    {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(Character.isLetterOrDigit(c)
                  || c == ' ')) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        String s1 = "Hello World";
        if (hasSpecialChar(s1)) {
            System.out.println(
                "The string contains special characters.");
        }
        else {
            System.out.println(
                "The string does not contain special characters.");
        }
        String s2 = "Hello@World";
        if (hasSpecialChar(s2)) {
            System.out.println(
                "The string contains special characters.");
        }
        else {
            System.out.println(
                "The string does not contain special characters.");
        }
    }
	
}
