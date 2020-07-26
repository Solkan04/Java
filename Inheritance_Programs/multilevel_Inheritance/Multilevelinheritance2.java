package multilevel_Inheritance;
//multilevel inheritance with non static variables & non-static methods
class Grandfather2
{
	int i=10;
	public void test()
	{
		System.out.println("Test");
	}
}
class Father2 extends Grandfather2
{
	int j=20;
	public void test1()
	{
		System.out.println("test1");
	}
}
class ChildMI1 extends Father2
{
	int k=30;
	public void test2()
	{
		System.out.println("test2");
	}
}
public class Multilevelinheritance2 
{
	public static void main(String[] args) 
	{
		ChildMI1 ch2=new ChildMI1();
		System.out.println(ch2.i);
		ch2.test();
		System.out.println(ch2.j);
		ch2.test1();
		System.out.println(ch2.k);
		ch2.test2();
	}
}
