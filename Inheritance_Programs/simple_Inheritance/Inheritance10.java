package simple_Inheritance;
//simple inheritance with parameterized constructor in child class
class Parent10
{
	public void test()
	{
		System.out.println("test");
	}
}
class Child10 extends Parent10
{
	Child10()
	{
		System.out.println("Child class default constructor");
	}
	Child10(String Name)
	{
		System.out.println("Child class with String Parameter");
	}
}
public class Inheritance10 
{
	public static void main(String[] args) 
	{
		Child10 ch10a=new Child10();
		ch10a.test();
		Child10 ch10b=new Child10("Mahesh");
		ch10b.test();
	}
}
