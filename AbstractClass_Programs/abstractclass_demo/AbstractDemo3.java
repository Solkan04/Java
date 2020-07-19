package abstractclass_demo;
//Abstract keywords cannot be used for static members
abstract class Bike
{
	//abstract   static void run();
	//abstract   static void mileage();
}
class Honda extends Bike
{
	public static void run()
	{
		System.out.println("Running Safely...");
	}
	public static void mileage()
	{
		System.out.println("Has very good	 mileage");
	}
}
public class AbstractDemo3
{
	public static void main(String[] args) 
	{
		Honda.run();
		Honda.mileage();
	}
}
