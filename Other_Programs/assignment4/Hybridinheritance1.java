package assignment4;
//Hybrid inheritance without parent having parameterized constructor
class Parent7
{
	Parent7()
	{
		System.out.println("Parent7 default constructor");
	}
}
class Child13 extends Parent7
{
	Child13()
	{
		super();
		System.out.println("Child13 default constructor");
	}
}
class Child14 extends Parent7
{
	Child14()
	{
		System.out.println("Child14 default constructor");
	}
}
class Child15 extends Child13
{
	Child15()
	{
		super();
		System.out.println("Child15 default constructor");
	}
}
public class Hybridinheritance1
{
	public static void main(String[] args) 
	{
		Child13 ch1=new Child13();
		Child14 ch2=new Child14();
		Child15 ch3=new Child15();
	}
}
