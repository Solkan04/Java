package constructor_demo;

public class Constructor2 
{
	Constructor2()
	{
		System.out.println("Default Constructor");
	}
	public void display()
	{
		System.out.println("Default Method");
		new Constructor2();
	}
	public static void main(String[] args) 
	{
		Constructor2 c=new Constructor2();
		c.display();
	}
}
