package auto.practice;

interface Drawable
{  
	void draw();  
}  
class Rectangle1 implements Drawable
{  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  
class Circle implements Drawable
{  
	public void draw()
	{
		System.out.println("drawing circle");
	}  
}  

public class InterfaceEx32 {

	public static void main(String[] args) {
		Drawable d=new Circle();  
		d.draw();  
		}

}
