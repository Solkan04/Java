package abstractclass_demo;
//Abstract method with parameterized constructor
abstract class Parent22 
{
	abstract void showCityName(String city);

	abstract void showStateAndPIN(String city, int PIN);
}
abstract class Child22 extends Parent22 
{
	void showCityName(String city) 
	{
		System.out.println("City name is :" + city);
	}
}
class Child33 extends Child2 
{
	void showStateAndPIN(String city, int PIN) 
	{
		System.out.println("State is :" + city + " & PIN is :" + PIN);
	}
}
public class AbstractDemo6
{
	public static void main(String[] args) 
	{
		Child33 ch3 = new Child33();
		ch3.showCityName("Raichur");
		ch3.showStateAndPIN("Karnataka", 560104);
	}
}