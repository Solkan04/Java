package methods_demo;
class C
{
	public void test1()
	{
		C c2=new C();
		c2.test2();
		System.out.println("Test1");
	}
	public void test2()
	{
		System.out.println("Test2");
	}
}
public class Method7 
{
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.test1();
		System.out.println("Main");
	}
}
