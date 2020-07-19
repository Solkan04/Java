package thiskeyword_demo;
//calling the constructor using "this" keyword
public class Q 
{
	Q()
	{
		this(100);//calls the constructor with int parameter
		System.out.println("Q");
	}
	Q(int i)//parameterized constructor
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		new Q();
	}
}
