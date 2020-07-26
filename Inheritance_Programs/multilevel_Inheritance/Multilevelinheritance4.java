package multilevel_Inheritance;
//Multilevel inheritance with static method
class Grandfather4
{
	public static void display1()
	{
		System.out.println("Grandfather");
	}
}
class Father4 extends Grandfather4
{
	public static void display2()
	{
		System.out.println("Father");
	}
}
class Child4 extends Father4
{
	public static void display3()
	{
		System.out.println("Child");
	}
}
public class Multilevelinheritance4 
{
	public static void main(String[] args) 
	{
		Child4.display1();
		Child4.display2();
		Child4.display3();
	}
}
