package simple_Inheritance;
//simple inheritance with both static & non-static members
class Parent7
{
	int i=10;
	static int j=5;
	public void test()
	{
		System.out.println("test");
	}
	public static void test1()
	{
		System.out.println("test1");
	}
}
public class Inheritance7 extends Parent7
{
	int k=15;
	public void test2()
	{
		System.out.println("Test2");
	}
	public static void main(String[] args) 
	{
		Inheritance7 obj=new Inheritance7();
		System.out.println(obj.i);
		System.out.println(Inheritance7.j);
		obj.test();
		Inheritance7.test1();
		System.out.println(obj.k);
		obj.test2();
	}
}
