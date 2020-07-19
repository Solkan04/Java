package constructor_demo;

public class Parameterizedconstructor 
{
	Parameterizedconstructor(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		new Parameterizedconstructor(100);
	}
}
