package superkeyword_demo;
//Super keyword with static method
class Parent2
{
	int i=10;
}
class Child2 extends Parent2
{
	public static void test()
	{
		//System.out.println(super.i);//Super keyword cannot be used inside a static method
		System.out.println("Cannot use Super keyword in static method");
	}
}
public class Superkeyword2 
{
	public static void main(String[] args) 
	{
		Child2.test();
	}
}
