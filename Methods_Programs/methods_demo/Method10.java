package methods_demo;
//Display vowels using static methods
class K
{
	public static void test1()
	{
		System.out.println("A");
	}
	public static void test2()
	{
		System.out.println("I");
	}
	public static void test3()
	{
		System.out.println("U");
	}
}
public class Method10 
{
	public static void main(String[] args) 
	{
		K.test1();
		System.out.println("E");
		K.test2();
		System.out.println("O");
		K.test3();
	}
}
