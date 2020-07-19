package superkeyword_demo;
//Super keyword with non-static variable
class Parent1
{
	int i=10;
}
class Child1 extends Parent1
{
	public void test()
	{
		System.out.println(super.i);
	}
}
public class Superkeyword1 
{
	public static void main(String[] args) 
	{
		Child1 ch1=new Child1();
		ch1.test();
	}
}
//Super keyword can also be used to access variable of parent class