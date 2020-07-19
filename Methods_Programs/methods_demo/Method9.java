package methods_demo;
class E
{
	public void test2()
	{
		E e1=new E();
		e1.test1();
		System.out.println("Test2");
		e1.test1();
	}
	public void test1()
	{
		System.out.println("Test1");
	}
}
public class Method9 
{
	public static void main(String[] args) 
	{
		E e2=new E();
		e2.test2();
		System.out.println("From Main");
		e2.test2();
	}
}
