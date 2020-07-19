package thiskeyword_demo;

public class B 
{
	int i=10;
	public static void main(String[] args) 
	{
		B b=new B();
		b.test();
		System.out.println(b.i);
	}
	public void test()
	{
		System.out.println(this.i);
	}
}
//above program access the members of the object