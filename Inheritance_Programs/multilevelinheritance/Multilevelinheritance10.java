package multilevelinheritance;
//Multilevel inheritance with default constructor in parent class
class Grandfather10
{
	int i=10;
	Grandfather10()
	{
		System.out.println("Parent class with default constructor");
	}
}
class Father10 extends Grandfather10
{
	Father10()
	{
		System.out.println("Parent[Father class] with default constructor"); 
	}
}
class Child10  extends Father10
{
	Child10()
	{
		System.out.println("Child class with default constructor");
	}
}
public class Multilevelinheritance10 
{
	public static void main(String[] args) 
	{
		Child10 ch10=new Child10();
		System.out.println(ch10.i);
	}
}
