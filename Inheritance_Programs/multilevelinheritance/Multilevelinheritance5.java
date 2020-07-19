package multilevelinheritance;
//Multilevel inheritance with a static method & accessing method with a reference
class Grandfather5
{
	public static void display1()
	{
		System.out.println("Grandfather");
	}
}
class Father5 extends Grandfather5
{
	public static void display2()
	{
		System.out.println("Father");
	}
}
class Child5 extends Father5
{
	public static void display3()
	{
		System.out.println("Child");
	}
}
public class Multilevelinheritance5 
{
	public static void main(String[] args) 
	{
		Child5 ch5=new Child5();
		ch5.display1();//When we access static members in a non-static way then we'll get a warning with output
		ch5.display2();//When we access static members in a non-static way then we'll get a warning with output
		ch5.display3();//When we access static members in a non-static way then we'll get a warning with output
	}
}
