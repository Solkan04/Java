package multilevel_Inheritance;
//Multilevel inheritance with default constructor in Child class
class Grandfather8
{
	public void test()
	{
		System.out.println("Test");
	}
}
class Father8 extends Grandfather8
{
	public void test1()
	{
		System.out.println("Test1");
	}
}
class ChildMI8 extends Father8
{
	ChildMI8()
	{
		System.out.println("Child class with default constructor");
	}
}
public class Multilevelinheritance8 
{
	public static void main(String[] args) 
	{
		ChildMI8 ch8=new ChildMI8();
		ch8.test();
		ch8.test1();
	}
}
