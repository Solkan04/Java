package multilevelinheritance;
//Multilevel inheritance with non-static method
class Grandfather1
{
	public void Display1()
	{
		System.out.println("Display1");
	}
}
class Father1 extends Grandfather1
{
	public void Display2()
	{
		System.out.println("Display2");
	}
}
class Child1 extends Father1
{
	public void Display3()
	{
		System.out.println("Display3");
	}
}
public class Multilevelinheritance1 
{
	public static void main(String[] args) 
	{
		Child1 ch1=new Child1();
		ch1.Display3();
		ch1.Display2();
		ch1.Display1();
	}
}
