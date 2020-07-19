package interface_demo;
//interface having same method
interface A
{
	void test1();
}
interface B
{
	void test1();
}
class C implements A,B
{
	public void test1()
	{
		System.out.println("This is test1 method");
	}
}
public class InterfaceDemo6 
{
	public static void main(String[] args) 
	{
		C c=new C();
		c.test1();
		System.out.println("*********");
		B b=new C();
		b.test1();
		System.out.println("*********");
		A a=new C();
		a.test1();
	}
}
