package protected_packageA;
//Same package sub class
class ProtectedDemo1B
{
	protected int i=10;
	protected void test()
	{
		System.out.println("Protected modifier in sub class");
	}
}
public class ProtectedDemo1A extends ProtectedDemo1B
{
	public static void main(String[] args)
	{
		ProtectedDemo1A d=new ProtectedDemo1A();
		System.out.println(d.i);
		d.test();
	}
}

