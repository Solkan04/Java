package thiskeyword_demo;
//Calling constructor using "this" keyword
public class P 
{
	P(int i)
	{
		System.out.println(i);
		//this();//"this" keyword should be the first statement inside the constructor to call a constructor
	}
	P()
	{
		System.out.println("P");
	}
	public static void main(String[] args) 
	{
		new P(500);
	}
}
