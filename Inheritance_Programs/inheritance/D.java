package inheritance;

class Sample3
{
	int i;
	public void test1()
	{
		System.out.println("Test1");
	}
	public void test2()
	{
		System.out.println("Test2");
	}
}
public class D extends Sample3
{
	public void test3()
	{
		System.out.println("Test3");
	}
	public static void main(String[] args) 
	{
		D d=new D();
		System.out.println(d.i);
		d.test1();
		d.test2();
		d.test3();
	}
}
