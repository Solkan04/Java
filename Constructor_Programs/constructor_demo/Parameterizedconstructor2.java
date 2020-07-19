package constructor_demo;

public class Parameterizedconstructor2 
{
	Parameterizedconstructor2()
	{
		System.out.println("Default constructor");
	}
	Parameterizedconstructor2(int i)
	{
		System.out.println(i);
	}
	Parameterizedconstructor2(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		new Parameterizedconstructor2();
		new Parameterizedconstructor2(100);
		new Parameterizedconstructor2("Mahesh");
	}
}
