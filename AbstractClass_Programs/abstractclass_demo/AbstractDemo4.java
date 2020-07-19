package abstractclass_demo;
//Abstract class with parameterized methods
abstract class Parent11
{
	abstract public void addition(int a,int b);
	abstract public void substraction(int x,int y);
}
class Child11 extends Parent11
{
	public void addition(int a,int b)
	{
		int res=a+b;
		System.out.println("Addition:" +res);
	}
	public void substraction(int x,int y)
	{
		int res=x-y;
		System.out.println("Substraction:"+res);
	}
}
public class AbstractDemo4 
{
	public static void main(String[] args) 
	{
		Child11 ch1=new Child11();
		ch1.addition(24, 25);
		ch1.substraction(50, 25);
	}
}
