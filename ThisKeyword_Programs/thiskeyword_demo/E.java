package thiskeyword_demo;

public class E 
{
	public static void main(String[] args) 
	{
		E e=new E();
		e.test1();
	}
	public void test1()
	{
		System.out.println("test1");
		this.test2();
		System.out.println("test1");
	}
	public void test2()
	{
		System.out.println("test2");
	}
}
