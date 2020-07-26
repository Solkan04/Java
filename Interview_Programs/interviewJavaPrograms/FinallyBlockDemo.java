package interviewJavaPrograms;

public class FinallyBlockDemo
{
	public static void main(String[] args) 
	{
		//test1();
		//test2();
		test3();
	}
	public static void test1()
	{
		try
		{
			System.out.println("inside Test1 method");
			throw new Exception("Hello world");
		}catch(Exception e)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
	public static void test2()
	{
		try
		{
			System.out.println("Inside test2 method");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
	public static void test3()
	{
		int a=10;
		try
		{
			System.out.println("Indide test3 method");
			int k=a/0;
		}catch(Exception e)
		{
			System.out.println("Number cannot be divided by zero");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}

}
