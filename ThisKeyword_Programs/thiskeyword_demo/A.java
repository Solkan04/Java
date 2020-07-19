package thiskeyword_demo;

public class A 
{
	int i=10;//non-static variable
	public static void main(String[] args) 
	{
		A a=new A();
		a.test();
		System.out.println(a);//"a" is a reference created by programmer
	}
	public void test()
	{
		System.out.println(this);//"this" is a reference created by compiler
	}
}
//above program gives the memory address of the object