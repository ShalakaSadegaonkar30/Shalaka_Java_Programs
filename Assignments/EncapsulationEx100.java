package Assignments;

class Amazon
{
	private String Name="ABC";

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	
}
public class EncapsulationEx100 {

	public static void main(String[] args) {

		Amazon am=new Amazon();
		am.setName("Shalaka");
		System.out.println(am.getName());
		
	}

}
