package inheritance;

class Sample5
{
	public static void test()
	{
		System.out.println("Test");
	}
}
public class F extends Sample5
{
	public static void main(String[] args) 
	{
		F.test();//Compiler automatically converts "F.test()" to "Sample.test()"
	}
}
