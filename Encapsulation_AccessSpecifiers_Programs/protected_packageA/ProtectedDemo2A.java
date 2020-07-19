package protected_packageA;
//Same package non-sub class
class ProtectedDemo2B
{
	protected int i=20;
	protected void test()
	{
		System.out.println("Protected modifier in same package non-sub class");
	}
}
public class ProtectedDemo2A 
{
	public static void main(String[] args) 
	{
		ProtectedDemo2B d=new ProtectedDemo2B();
		System.out.println(d.i);
		d.test();
	}
}