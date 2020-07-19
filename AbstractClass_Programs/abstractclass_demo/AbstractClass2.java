package abstractclass_demo;
abstract class Parent2 
{
	abstract void showCityName(String city);

	abstract void showStateAndPIN(String city, int PIN);
}
abstract class Child2 extends Parent2 
{
	void showCityName(String city) 
	{
		System.out.println("City name is :" + city);
	}
}
class Child3 extends Child2 
{
	void showStateAndPIN(String city, int PIN) 
	{
		System.out.println("State is :" + city + " & PIN is :" + PIN);
	}
}
public class AbstractClass2 
{
	public static void main(String[] args) 
	{
		Child3 ch3 = new Child3();
		ch3.showCityName("Raichur");
		ch3.showStateAndPIN("Karnataka", 560104);
	}
}