package methods_demo;
//Methods which does not return any value
public class Method3 
{
	public void test2()
	{
		Method3 mta=new Method3();
		mta.test1();
		System.out.println("Test2");
		mta.test1();
	}
	public static void main(String[] args) 
	{
		Method3 mtb=new Method3();
		mtb.test2();
		System.out.println("From Main");
		mtb.test2();
	}
	public void test1()
	{
		System.out.println("Test1");
	}
}
