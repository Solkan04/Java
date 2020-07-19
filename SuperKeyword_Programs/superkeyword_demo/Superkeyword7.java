package superkeyword_demo;
//Super keyword with parameterized constructor in parent class
class Parent7
{
	Parent7(String s)
	{
		System.out.println(s);
	}
}
class Child7 extends Parent7
{
	Child7()
	{
		super("Mahesh");//calls the parent class parameterized constructor
		System.out.println("Child class default constructor");
	}
}
public class Superkeyword7 
{
	public static void main(String[] args) 
	{
		new Child7();
	}
}
//When there is a Parameterized constructor in parent class,
//then the compiler will not add super keyword automatically to call parent class constructor
//It is mandatory to use super keyword explicitly in a child class constructor if the parent class is having parameterized constructor.
