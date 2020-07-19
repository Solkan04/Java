package superkeyword_demo;
//Using both super & this keyword in same constructor
class Parent9
{
	Parent9()
	{
		System.out.println("Parent class default constructor");
	}
}
class Child9 extends Parent9
{
	Child9(int i)
	{
		this();
		//super();
	}
	Child9()
	{
		System.out.println("Child class default constructor");
	}
}
public class Superkeyword9 
{
	public static void main(String[] args) 
	{
		new Child9();
	}
}
//Both this & super cannot be used in a same constructor at a time as both needs to be the first statement inside a constructor