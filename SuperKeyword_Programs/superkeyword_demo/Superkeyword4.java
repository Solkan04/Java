package superkeyword_demo;
//Super keyword accessing the static method
class Parent4
{
	public static void test()
	{
		System.out.println("Static method in parent class");
	}
}
class Child4 extends Parent4
{
	public void test1()
	{
		super.test();
		System.out.println("Non-static method in child class");
	}
}
public class Superkeyword4 
{
	public static void main(String[] args) 
	{
		Child4 ch4=new Child4();
		ch4.test1();
	}
}
//Super keyword can access static methods in parent class but super keyword cannot be used in static method
