package thiskeyword_demo;
//"this" keyword in constructor
public class I 
{
	int i=10;
	I()
	{
		System.out.println(this.i);
	}
	public static void main(String[] args) 
	{
		new I();
		System.out.println("Main");
	}
}
