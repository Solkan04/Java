package methods_demo;
//Methods which does not return any value with parameters
class sample1
{
	void addition(int a, int b)
	{
		int result=a+b;
		System.out.println(" " +result);
	}
	void multiplication(int a, int b)
	{
		int result=a*b;
		System.out.println(" " +result);
	}
}
public class Method2 
{
	public static void main(String[] args) 
	{
		sample1 s=new sample1();
		s.addition(10, 2);
		s.multiplication(5, 2);
	}
}
