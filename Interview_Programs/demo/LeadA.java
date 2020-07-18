package demo;

public class LeadA 
{
	public static void main(String[] args) 
	{
		System.out.println(LeadA.add(2, 3));
		System.out.println(LeadA.multi(4, 5));
		
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	static int multi(int x,int y)
	{
		return x*y;
	}
}
