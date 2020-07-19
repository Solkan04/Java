package methods_demo;
//Methods which does not return any value without parameters
class sample
{
	void addition()
	{
		int a=2;
		int b=5;
		int result=a+b;
		System.out.println(" " +result);
	}
	void multiplication()
	{
		int result=2*5;
		System.out.println(" " +result);
	}
}
public class Method1 
{
	public static void main(String[] args) 
	{
		sample s=new sample();
		s.addition();
		s.multiplication();
	}
}
