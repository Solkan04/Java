package demo;

public class O 
{
	static boolean i;
	public static void test()
	{
		System.out.println("Test");
	}
	public static void main(String[] args) 
	{
		System.out.println(i);//compile will add (O.i)
		test();//compile will default add O.test()
	}
}
