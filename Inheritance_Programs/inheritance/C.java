package inheritance;

class Sample2
{
	public void test()
	{
		System.out.println("Test");
	}
}
public class C extends Sample2
{
	public static void main(String[] args) 
	{
		C c=new C();
		c.test();
	}
}
