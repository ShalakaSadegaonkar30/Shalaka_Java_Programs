package auto.practice;

interface Youtube
{
	void watch_later();
	void play();
}
interface Gmail
{
	void schedule();
	void inbox();
}

public class InterfaceEx_MultipleLevel implements Youtube,Gmail {

	
	@Override
	public void schedule() {
		System.out.println("Schedule song...");
	}

	@Override
	public void inbox() {
		System.out.println("Check inbox...");
		
	}

	@Override
	public void watch_later() {
		System.out.println("Listen later...");

	}

	@Override
	public void play() {
		System.out.println("Auto play song...");

	}
	public static void main(String[] args) {
			
		InterfaceEx_MultipleLevel obj=new InterfaceEx_MultipleLevel();
		obj.inbox();
		obj.schedule();
		obj.play();
		obj.watch_later();
		}

}
