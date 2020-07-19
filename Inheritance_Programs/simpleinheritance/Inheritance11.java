package simpleinheritance;
//Simple inheritance with default constructor in Parent class
class Parent11
{
	public void test()
	{
		System.out.println("test");
	}
	Parent11()
	{
		System.out.println("Parent class with default constructor");
	}
}
class Child11 extends Parent11
{
	Child11()
	{
		//super();
		System.out.println("Child class default constructor");
	}
}
public class Inheritance11 
{
	public static void main(String[] args) 
	{
		Child11 ch11=new Child11();
		ch11.test();
	}
}
//If we create a constructor in a parent class then the same type of constructor has to be implemented in child class
