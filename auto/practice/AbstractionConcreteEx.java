package auto.practice;

class flipkart
{
	void flipkart_order_accepted() //concrete method
	{
		System.out.println("flipkart order accepted....");
	}
	void flipkart_order_rejected() //concrete method
	{
		System.out.println("flipkart order rejected....");
	}
}
abstract class amazon extends flipkart
{
	void Amazon_order_accepted() //concrete method
	{
		System.out.println("Amazon order accepted....");
	}
	void Amazon_order_rejected() //concrete method
	{
		System.out.println("Amazon order rejected....");
	}
	abstract void parcel_delivery_address(); //abstract method
	abstract void parcel_exchange_address(); //abstract method
	
}
class Nyka extends amazon
{
	void Nyka_order_accepted() //concrete method
	{
		System.out.println("Nyka order accepted....");
	}
	void Nyka_order_rejected() //concrete method
	{
		System.out.println("Nyka order rejected....");
	}
	@Override
	void parcel_delivery_address() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void parcel_exchange_address() {
		// TODO Auto-generated method stub
		
	}

}
public class AbstractionConcreteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nyka n=new Nyka();
		n.flipkart_order_accepted();
		n.flipkart_order_rejected();
		n.Amazon_order_accepted();
		n.Amazon_order_rejected();
		n.Nyka_order_accepted();
		n.Nyka_order_rejected();
	}

}
