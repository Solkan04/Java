package simpleinheritance;
//simple inheritance with static method & accessing static method with a reference
class Parent6
{
	public static void display()
	{
		System.out.println("My name is Mahesh");
	}
}
public class Inheritance6 extends Parent6
{
	public static void main(String[] args) 
	{
		Inheritance6 obj=new Inheritance6();
		obj.display();
	}
}
//When we access static members in a non-static way then we'll get a warning with output
