package thiskeyword_demo;

public class R 
{
	R()
	{
		System.out.println("S");
	}
	public static void main(String[] args) 
	{
		R r=new R();
		r.test();
	}
	public void test()
	{
		//this();//"this" keyword cannot be used inside a method to call a constructor, 
				//"this" keyword should be the first statement inside a constructor to call another constructor
	}
}
