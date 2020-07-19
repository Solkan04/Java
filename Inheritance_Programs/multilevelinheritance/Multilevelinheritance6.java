package multilevelinheritance;
//Multilevel inheritance with both static & non-static members
class Grandfather6
{
	int i=10;
	public void test1()
	{
		System.out.println("Gradfather");
	}
}
class Father6 extends Grandfather6
{
	static int j=20;
	public static void test2()
	{
		System.out.println("Father");
	}
}
class Child6 extends Father6
{
	int k=5;
	static int m=15;
	public void test3()
	{
		System.out.println("Child1");
	}
	public static void test4()
	{
		System.out.println("Child2");
	}
}
public class Multilevelinheritance6 
{
	public static void main(String[] args) 
	{
		Child6 ch6=new Child6();
		System.out.println(ch6.i);
		ch6.test1();
		System.out.println(Child6.j);
		Child6.test2();
		System.out.println(ch6.k);
		System.out.println(Child6.m);
		ch6.test3();
		Child6.test4();
	}
}
