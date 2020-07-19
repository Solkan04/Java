package methods_demo;
class D
{
	public static void test1()
	{
		System.out.println("Test1");
	}
	public void test2()
	{
		System.out.println("Test2");
	}
}
public class Method8 
{
	public static void main(String[] args) 
	{
		System.out.println("Start Main");
		D.test1();
		System.out.println("Main");
		D d=new D();
		d.test2();
		System.out.println("End Main");
	}
}