package methods_demo;
class B
{
	public static void test()
	{
		System.out.println("Mahesh");
	}
}
public class Method6 
{
	public static void main(String[] args) 
	{
		B.test();
		System.out.println("S C");
		B b=new B();
		b.test();
	}
}
