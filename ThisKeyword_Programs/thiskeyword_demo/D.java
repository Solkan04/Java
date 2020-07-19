package thiskeyword_demo;

public class D 
{
	int i=10;
	int j;
	static D d;
	public static void main(String[] args) 
	{
		d=new D();//do not use D d=new D(); as we will get an error
		d.test();
	}
	public void test()
	{
		System.out.println(d.i);
		System.out.println(this.j);
	}
}
