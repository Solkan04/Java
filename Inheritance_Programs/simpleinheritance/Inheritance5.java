package simpleinheritance;
//simple inheritance with static method
class Parent5
{
	public static void test()
	{
		System.out.println("Test");
	}
}
public class Inheritance5 extends Parent5
{
	public static void main(String[] args) 
	{
		Inheritance5.test();
	}
}
//static members are never inherited
//If we access static member in a child class then a conversion takes place to call parent class member giving us a feel of inheritance
