package simpleinheritance;
//Simple inheritance with non-static method & non-static variables
class Parent3
{
	int i=10;//non-static variable
	public void test()//non-static method
	{
		System.out.println("Test");
	}
	public void test1()//non-static method
	{
		System.out.println("test1");
	}
}
public class Inheritance3 extends Parent3
{
	public void test2()//non-static method in child class
	{
		System.out.println("Test2");
	}
	public static void main(String[] args) 
	{
		Inheritance3 obj=new Inheritance3();
		System.out.println(obj.i);
		obj.test();
		obj.test1();
		obj.test2();
	}
}
