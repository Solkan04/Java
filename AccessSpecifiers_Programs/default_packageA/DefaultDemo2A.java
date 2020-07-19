package default_packageA;
//Same package non-sub class
class DefaultDemo2B
{
	int i=20;
	void test()
	{
		System.out.println("Default modifier in same package non-sub class");
	}
}
public class DefaultDemo2A 
{
	public static void main(String[] args) 
	{
		DefaultDemo2B d=new DefaultDemo2B();
		System.out.println(d.i);
		d.test();
	}
}
//private modifier is accessible in same package non-sub class
