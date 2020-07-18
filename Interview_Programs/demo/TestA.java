package demo;

public class TestA 
{
	public static void main(String[] args) 
	{
		TestA.add(2, 3);
		TestA.multi(3, 4);
	}

	static void add(int a, int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	static void multi(int x, int y)
	{
		int res=x*y;
		System.out.println(res);
	}
}
