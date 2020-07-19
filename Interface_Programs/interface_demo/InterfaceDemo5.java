package interface_demo;
//interface extends interface.class implements interface
interface Test1
{
	void test1method();
}
interface Test2 extends Test1
{
	void test2method();
}
class Sample3 implements Test2
{
	public void test1method()
	{
		System.out.println("Test1 method");
	}
	public void test2method()
	{
		System.out.println("Test2 method");
	}
}
public class InterfaceDemo5 
{
	public static void main(String[] args) 
	{
		Sample3 s3=new Sample3();
		s3.test1method();
		s3.test2method();
	}
}
