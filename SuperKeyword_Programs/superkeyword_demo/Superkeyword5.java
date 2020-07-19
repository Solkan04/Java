package superkeyword_demo;
//Super keyword with static variable
class Parent5
{
	static int i=10;
}
class Child5 extends Parent5
{
	public void test()
	{
		System.out.println(super.i);
	}
}
public class Superkeyword5 
{
	public static void main(String[] args) 
	{
		Child5 ch5=new Child5();
		ch5.test();
	}
}
//if we access static variable in parent class using super keyword then will get a warning with output

