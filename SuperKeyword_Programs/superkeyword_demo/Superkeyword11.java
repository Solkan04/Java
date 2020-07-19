package superkeyword_demo;

class Grandfather11
{
	Grandfather11()
	{
		System.out.println("Parent class default constructor");
	}
}
class Father11 extends Grandfather11
{
	
}
class Child11 extends Father11
{
	
}
public class Superkeyword11 
{
	public static void main(String[] args) 
	{
		new Child11();
	}
}
//Compiler will automatically add constructor with super keyword in child[Father11 class & Child11 class] class as shown below
//class Father11
//{
//	Father11()
//	{
//		super();
//	}
//}
//