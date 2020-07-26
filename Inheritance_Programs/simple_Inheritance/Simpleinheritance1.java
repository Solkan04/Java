package simple_Inheritance;
//Simple inheritance without parent having parameterized constructor
class ParentSI2
{
	ParentSI2()
	{
		System.out.println("Parent1 default constructor");
	}
}
class Child1 extends ParentSI2
{
	Child1()
	{
		super();
		System.out.println("Child1 default constructor");
	}
}
public class Simpleinheritance1 
{
	public static void main(String[] args) 
	{
		Child1 ch1=new Child1();
	}
}