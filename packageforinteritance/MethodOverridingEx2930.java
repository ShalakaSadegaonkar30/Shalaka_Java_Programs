package packageforinteritance;
class Method_parent
{
	 void login()
	{
		System.out.println("Login with mobile no");
	}
}
public class MethodOverridingEx2930 extends Method_parent
{
	void login()
	{
		super.login();
		System.out.println("Login with email id");
	}
	public static void main(String[] args)
	{
		MethodOverridingEx2930 m1=new MethodOverridingEx2930();
		m1.login();

		
	}

}
