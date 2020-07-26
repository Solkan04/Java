package simple_Inheritance;
//Simple inheritance with default constructor in child class
class Parent9
{
	public void test()
	{
		System.out.println("Parent class method");
	}
}
class Child9 extends Parent9
{
	Child9()
	{
		System.out.println("Child class with default constructor");
	}
}
public class Inheritance9 
{
	public static void main(String[] args) 
	{
		Child9 ch9=new Child9();
		ch9.test();
	}
}
