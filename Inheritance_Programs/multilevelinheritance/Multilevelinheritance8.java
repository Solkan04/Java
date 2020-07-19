package multilevelinheritance;
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
class Child8 extends Father8
{
	Child8()
	{
		System.out.println("Child class with default constructor");
	}
}
public class Multilevelinheritance8 
{
	public static void main(String[] args) 
	{
		Child8 ch8=new Child8();
		ch8.test();
		ch8.test1();
	}
}
