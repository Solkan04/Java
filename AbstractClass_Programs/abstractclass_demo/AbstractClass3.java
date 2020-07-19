package abstractclass_demo;

abstract class Parent3 
{
	void cityName() 
	{
		System.out.println("The city name is Bangalore");
	}

	Parent3()//Constructor will execute second
	{
		System.out.println("Abstract class Default constructor");
	}

	static//static block will execute first
	{
		System.out.println("Abstract class static block");
	}
}
class Child4 extends Parent3 
{

}
public class AbstractClass3 
{
	public static void main(String[] args) 
	{
		Child4 ch4 = new Child4();
		ch4.cityName();
	}
}