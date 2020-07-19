package abstractclass_demo;
//Abstract class with parameterized constructor & abstract method
abstract class Bike1
{
	Bike1(int i)
	{
		System.out.println("Mileage is : " +i);
	}
	abstract void test();
}
class Sample extends Bike1
{
	Sample()
	{
		super(60);
	}
	void test()
	{
		
		System.out.println("Test is successfull");
	}
}
public class AbstractDemo5
{
	public static void main(String[] args) 
	{
		//Bike1 b=new Sample();
		//b.test();
		Sample s=new Sample();
		s.test();
	}
}
