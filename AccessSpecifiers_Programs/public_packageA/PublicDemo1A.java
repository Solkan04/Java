package public_packageA;
//Same package sub class
class PublicDemo1B
{
	public int i=10;
	public void test()
	{
		System.out.println("Public access specifier in sub class");
	}
}
public class PublicDemo1A extends PublicDemo1B
{
	public static void main(String[] args)
	{
		PublicDemo1A p=new PublicDemo1A();
		System.out.println(p.i);
		p.test();
	}
}
