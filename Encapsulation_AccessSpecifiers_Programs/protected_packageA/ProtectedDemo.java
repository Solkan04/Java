package protected_packageA;
//Same class
public class ProtectedDemo 
{
	protected int i=10;
	protected void test()
	{
		System.out.println("Protected Modifier accessible in Same class");
	}
	public static void main(String[] args) 
	{
		ProtectedDemo d=new ProtectedDemo();
		System.out.println(d.i);
		d.test();
	}
}
