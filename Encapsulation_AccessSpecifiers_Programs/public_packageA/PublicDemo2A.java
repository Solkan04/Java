package public_packageA;
//Same Package non-sub class
class PublicDemo2B
{
	public int i=20;
	public void test()
	{
		System.out.println("Public access specifier in same package non-sub class");
	}
}
public class PublicDemo2A 
{
	public static void main(String[] args) 
	{
		PublicDemo2B p=new PublicDemo2B();
		System.out.println(p.i);
		p.test();
	}
}

