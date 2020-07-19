package return_keyword;
class A
{
	public void test()
	{
		System.out.println("Test");
		return;
	}
}

public class Method2 
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.test();
		System.out.println("Main");
	}
}
//Can use return keyword even when the method is of the type void
//but method cannot be of the type void while returning the value
