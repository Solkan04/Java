package thiskeyword_demo;
//accessing non-static method directly
//another way of calling constructor
public class M 
{
	M()
	{
		System.out.println("M");
	}
	public static void main(String[] args) 
	{
		new M().test();//here "new M()" is an object created
	}
	public void test()
	{
		System.out.println("test");
	}
}
