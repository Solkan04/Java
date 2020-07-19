package default_packageA;
//Same package sub class
class DefaultDemo1B
{
	int i=10;
	void test()
	{
		System.out.println("Default modifier in sub class");
	}
}
public class DefaultDemo1A extends DefaultDemo1B
{
	public static void main(String[] args)
	{
		DefaultDemo1A d=new DefaultDemo1A();
		System.out.println(d.i);
		d.test();
	}
}
