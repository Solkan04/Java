package superkeyword_demo;

class Parent10
{
	Parent10()
	{
		System.out.println("Parent class default constructor");
	}
}
public class Superkeyword10 extends Parent10
{
	public static void main(String[] args)
	{
		new Superkeyword10();
	}
}
//Constructor can never or cannot be inherited
//Parent class constructor is called automatically when a child class object is created
//The compiler will automatically add child class constructor with super keyword to call the parent class constructor
//class Superkeyword10 extends Parent10
//{
//	Superkeyword10()
//	{
//		super();
//	}
//}