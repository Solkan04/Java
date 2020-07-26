package multilevel_Inheritance;
//Multilevel inheritance without parent having parameterized constructor
class Parent2
{
	Parent2()
	{
		System.out.println("Parent2 class default constructor");
	}
}
class Child2 extends Parent2
{
	String sName;
	Child2()
	{
		super();
		System.out.println("Child2 class Default constructor");
	}
}
class Child3 extends Child2
{
	String city;
	Child3(String city)
	{
		super();
		this.city=city;
		System.out.println("Child3 class constructor");
	}
}
public class Multilevelinheritance12 
{
	public static void main(String[] args) 
	{
		Child3 ch3=new Child3("Raichur");
	}
}
